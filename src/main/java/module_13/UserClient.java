package module_13;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.MessageFormat;
import java.util.*;

public class UserClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserClient.class);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final String ENDPOINT_USERS = "users";
    private static final String ENDPOINT_POSTS = "posts";
    private static final String ENDPOINT_TODOS = "todos";
    private static final String HOST = "https://jsonplaceholder.typicode.com";
    private static final String POST = "POST";
    private static final String GET = "GET";
    private static final String DELETE = "DELETE";
    private static final String PUT = "PUT";
    private static final String USER_NAME =  "username";

    public static final String RESOURCES_DIRECTORY = "./src/main/resources/module_13/";

    public List<Task> getToDos() {
        int userId = 4;
        HttpURLConnection connection = createConnection(ENDPOINT_TODOS + "/" + userId + "/todos", GET);
        Task[] tasks = readResponse(connection, Task[].class);
        List<Task> result = new ArrayList<>();
        if(tasks != null && tasks.length > 0){
            for (Task t : tasks) {
                if(!t.isCompleted()){
                 result.add(t);
                }
            }
        }
        return result;
    }


    public File getCommentsToFile(int userId) {
        HttpURLConnection connection = createConnection(ENDPOINT_USERS + "/" + userId + "/posts", GET);
        Post[] posts = readResponse(connection, Post[].class);
        if (posts != null && posts.length > 0) {
            int postId = -1;
            for (Post p : posts) {
                if (postId < p.getId()) {
                    postId = p.getId();
                }
            }
            HttpURLConnection connection2 = createConnection(ENDPOINT_POSTS + "/" + postId + "/comments", GET);
            Comment[] comments = readResponse(connection2, Comment[].class);
            if (comments != null){
                return writeToFile(comments, MessageFormat.format("user-{0}-post-{1}-comments.json", userId, postId));
            }
        }
        return null;
    }

    public User getUserByUsername(String username) {
        Map<String, String> args = new HashMap<>();
        args.put(USER_NAME, username);
        HttpURLConnection connection = createConnection(ENDPOINT_USERS, GET, args);
        User[] result = readResponse(connection, User[].class);
        if (result != null && result.length > 0){
            return result[0];
        }
        return null;
    }

    public User getUserById(int userId) {
        HttpURLConnection connection = createConnection(ENDPOINT_USERS +"/" + userId, GET);
        return readResponse(connection, User.class);
    }

    public boolean deleteUser(int userId) {
        try {
            LOGGER.info("Try delete user with id: {}", userId);
            HttpURLConnection connection = createConnection(ENDPOINT_USERS + "/" + userId, DELETE);
            int responseCode = connection.getResponseCode();
            return responseCode == HttpURLConnection.HTTP_OK;
        } catch (IOException e) {
            LOGGER.error("Response error!", e);
            throw new RuntimeException(e);
        }
    }

    public User[] getUsers() {
        HttpURLConnection connection = createConnection(ENDPOINT_USERS, GET);
        return readResponse(connection, User[].class);
    }

    public User updateUser(User user) {
        HttpURLConnection connection = createConnection(ENDPOINT_USERS, PUT);
        writeRequest(connection, user);
        return readResponse(connection, User.class);
    }

    public User createNewUser(User user) {
        HttpURLConnection connection = createConnection(ENDPOINT_USERS, POST);
        writeRequest(connection, user);
        return readResponse(connection, User.class);
    }

    private <T> T readResponse(HttpURLConnection connection, Class<T> responseClass) {
        try {
            int responseCode = connection.getResponseCode();
            if (responseCode >= HttpURLConnection.HTTP_OK && responseCode < HttpURLConnection.HTTP_MULT_CHOICE) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    sb.append(inputLine).append("\n");
                }
                in.close();
                String json = sb.toString();
                LOGGER.debug("Response: {}", json);
                return GSON.fromJson(json, responseClass);
            } else {
                LOGGER.error("Response code not valid: {}", connection.getResponseCode());
            }
        } catch (IOException e) {
            LOGGER.error("Read response error!", e);
        }
        return null;
    }

    private <T> void writeRequest(HttpURLConnection connection, T request) {
        try {
            String json = GSON.toJson(request);
            LOGGER.debug("Request: {}", json);
            connection.setDoOutput(true);
            OutputStream os = connection.getOutputStream();
            os.write(json.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private HttpURLConnection createConnection(String path, String method) {
        return createConnection(path, method, null);
    }
    private HttpURLConnection createConnection(String path, String method, Map<String, String> queryArgs) {
        try {
            StringBuilder queryBuilder = new StringBuilder(HOST);
            queryBuilder.append("/").append(path);
            if (queryArgs != null && !queryArgs.isEmpty()) {
                queryBuilder.append("?");
                for (Map.Entry<String, String> entry : queryArgs.entrySet()) {
                    queryBuilder.append(entry.getKey()).append('=').append(entry.getValue());
                }
            }
            URL connectionUrl = new URL(queryBuilder.toString());
            HttpURLConnection connection = (HttpURLConnection) connectionUrl.openConnection();
            connection.setRequestMethod(method);
            return connection;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private File writeToFile(Comment[] comments, String fileName) {
        File resultFile = new File(RESOURCES_DIRECTORY, fileName);
        if (!resultFile.getParentFile().exists()) {
            resultFile.getParentFile().mkdirs();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile))) {
            String json = GSON.toJson(comments);
            System.out.println(json);
            writer.write(json);
            return resultFile;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

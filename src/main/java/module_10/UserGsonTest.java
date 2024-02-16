package module_10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserGsonTest {

    public static final String RESOURCES_DIRECTORY = "./src/main/resources/module_10/";

    public static void main(String[] args) {
        List<User> userList = readUsers("User.txt");
        writeUsers(userList, "User.json");
    }

    private static void writeUsers(List<User> userList, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RESOURCES_DIRECTORY + fileName))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(userList);
            System.out.println(json);
            writer.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<User> readUsers(String fileName) {
        List<User> userList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(RESOURCES_DIRECTORY + fileName))) {
            String line = reader.readLine(); //Пропускаєм перший рядок.
            while ((line = reader.readLine()) != null) {
                String[] str = line.split(" ");
                String name = str[0];
                int age = Integer.parseInt(str[1]);
                User user = new User();
                user.setName(name);
                user.setAge(age);
                System.out.println(user);
                userList.add(user);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }
}

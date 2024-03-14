package module_13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;

public class UserClientTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserClientTest.class);

    public static void main(String[] args) {
        UserClientTest testApp = new UserClientTest();
        testApp.test(new UserClient());
    }
    private void test(UserClient userClient) {
        //task 1
        createNewUser(userClient);
        getUsers(userClient);
        deleteUser(userClient);
        updateUser(userClient);
        getUserById(userClient);
        getUserByName(userClient);
       

        //task 2
        getComments(userClient);

        //task 3
        getToDos(userClient);
    }

    private void getToDos(UserClient userClient) {
        int userId = 5;
        List<Task> tasks = userClient.getToDos();
        LOGGER.info("User id: {}, NOT completed tasks: {}", userId, tasks.toString());
    }

    private void getComments(UserClient userClient) {
        int userId = 5;
        File file = userClient.getCommentsToFile(userId);
        LOGGER.info("User id: {}, comments written to file: {}", userId, file);
    }

    private void getUserByName(UserClient userClient) {
        String userName = "Karianne";
        User result = userClient.getUserByUsername(userName);
        LOGGER.info("User userName: {}, result: {}", userName, result);
    }

    private void getUserById(UserClient userClient) {
        int userId = 8;
        User result = userClient.getUserById(userId);
        LOGGER.info("User id: {}, result: {}", userId, result);
    }

    private void deleteUser(UserClient userClient) {
        int userId = 2;
        boolean result = userClient.deleteUser(userId);
        LOGGER.info("User id:{} deleted:{}", userId, result);
    }
    private void getUsers(UserClient userClient) {
        User[] result = userClient.getUsers();
        if (result != null){
            LOGGER.info("Result succeed. Users count: {}", result.length);
        }
    }

    private void updateUser(UserClient userClient) {
        User user = new User();
        user.setName("Lyolik");
        user.setEmail("star@gmail.com");

        User result = userClient.updateUser(user);
        if (user.equals(result)){
            LOGGER.info("Result succeed. User equals: {}", result);
        }
    }

    private void createNewUser(UserClient userClient) {
        User user = createUserInstance();
        User result = userClient.createNewUser(user);
        if (result != null){
            LOGGER.info("Result succeed. User id: {}", result.getId());
        }
    }

    private User createUserInstance() {
        Geo geo = new Geo();
        geo.setLat("");
        geo.setLng("");

        Address address = new Address();
        address.setCity("LA");
        address.setStreet("Zelena");
        address.setSuite("56");
        address.setZipcode("534");
        address.setGeo(geo);

        Company company = new Company();
        company.setName("TUTU");
        company.setCatchPhrase("LA la la");
        company.setBs("23");

        User user = new User();
        user.setId(1);
        user.setName("Tatiana");
        user.setUsername("tatiana");
        user.setEmail("tatiana@gmail");
        user.setPhone("333 444");
        user.setWebsite("aa.com");
        user.setAddress(address);

        user.setCompany(company);
        return user;
    }
}

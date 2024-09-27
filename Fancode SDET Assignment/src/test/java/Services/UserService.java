package Services;

import Modals.Todo;
import Modals.User;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserService {

        private static final String BASE_URL = "http://jsonplaceholder.typicode.com";

        public static User[] getAllUsers() {
            Response response = RestAssured.get(BASE_URL + "/users");
            return new Gson().fromJson(response.asString(), User[].class);
        }
    }



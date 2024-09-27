package Services;

import Modals.Todo;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TodoService {

        private static final String BASE_URL = "http://jsonplaceholder.typicode.com";

        public static Todo[] getTodosByUserId(int userId) {
            Response response = RestAssured.get(BASE_URL + "/todos?userId=" + userId);
            return new Gson().fromJson(response.asString(), Todo[].class);
        }
    }

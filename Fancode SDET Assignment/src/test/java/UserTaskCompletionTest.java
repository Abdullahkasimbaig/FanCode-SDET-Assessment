import Modals.Todo;
import Modals.User;
import Services.TodoService;
import Services.UserService;
import Utilities.UserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class UserTaskCompletionTest {


        @Test
        public void testFanCodeUsersTaskCompletion() {
            User[] users = UserService.getAllUsers();
            for (User user : users) {
                if (UserUtils.isUserInFanCode(user.getAddress().getGeo())) {
                    Todo[] todos = TodoService.getTodosByUserId(user.getId());
                    double completionPercentage = UserUtils.calculateTaskCompletionPercentage(todos);
                    Assert.assertTrue(completionPercentage > 50,
                            "User " + user.getName() + " has less than 50% task completion.");
                }
                else {

                    System.out.println("All FanCode city users have more than 50% completed tasks");}
            }

            }
        }




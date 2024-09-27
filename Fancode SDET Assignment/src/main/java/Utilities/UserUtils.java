package Utilities;

import Modals.Geo;
import Modals.Todo;

public class UserUtils {


        public static boolean isUserInFanCode(Geo geo) {
            double lat = Double.parseDouble(geo.getLat());
            double lng = Double.parseDouble(geo.getLng());
            return (lat >= -40 && lat <= 5) && (lng >= 5 && lng <= 100);
        }

        public static double calculateTaskCompletionPercentage(Todo[] todos) {
            int totalTasks = todos.length;
            int completedTasks = 0;
            for (Todo todo : todos) {
                if (todo.isCompleted()) {
                    completedTasks++;
                }
            }
            return (completedTasks / (double) totalTasks) * 100;
        }
    }

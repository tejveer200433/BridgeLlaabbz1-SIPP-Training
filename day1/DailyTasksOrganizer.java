package day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class DailyTasksOrganizer {
    public static void main(String[] args) {
        Map<Integer, String> dailyTasks = new LinkedHashMap<>();

        dailyTasks.put(1, "Check emails");
        dailyTasks.put(2, "Prepare sales report");
        dailyTasks.put(3, "Call client");

        System.out.println("Morning Tasks: " + dailyTasks);

        dailyTasks.remove(2);

        System.out.println("Remaining Tasks after completion: " + dailyTasks);
    }
}

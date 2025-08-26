import java.util.LinkedList;

public class BusRouteNavigator {
    public static void main(String[] args) {
        LinkedList<String> route = new LinkedList<>();

        // Initial route
        route.add("Depot");
        route.add("Main Street");
        route.add("City Mall");
        route.add("Hospital");
        route.add("Airport");

        // Display initial route
        System.out.println("Initial Route: " + route);

        // Insertion: Add "University" after "City Mall"
        int cityMallIndex = route.indexOf("City Mall");
        if (cityMallIndex != -1) {
            route.add(cityMallIndex + 1, "University Stop");
        }
        System.out.println("Route after adding University Stop: " + route);

        // Deletion: Remove "Hospital"
        route.remove("Hospital");
        System.out.println("Route after removing Hospital: " + route);

        // Search: Check if "Airport" is in the route
        String searchStop = "Airport";
        if (route.contains(searchStop)) {
            System.out.println("The route still includes " + searchStop);
        } else {
            System.out.println("The route no longer includes " + searchStop);
        }
    }
}
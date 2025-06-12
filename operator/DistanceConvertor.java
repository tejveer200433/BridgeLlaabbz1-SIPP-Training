package operator;
import java.util.Scanner;

public class DistanceConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distanceInFeet = scanner.nextDouble();

        double distanceInYards = distanceInFeet / 3;

        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);

        scanner.close();
    }
}
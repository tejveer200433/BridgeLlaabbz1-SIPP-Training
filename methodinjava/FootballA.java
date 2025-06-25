package methodinjava;

import java.util.Random;
import java.util.Arrays;

public class FootballA {

    public static int[] generatePlayerHeights(int numberOfPlayers) {
        int[] heights = new int[numberOfPlayers];
        Random rand = new Random();
        for (int i = 0; i < numberOfPlayers; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }
        return heights;
    }

    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double calculateMeanHeight(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0.0;
        }
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        if (heights == null || heights.length == 0) {
            return -1;
        }
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }

    public static int findTallestHeight(int[] heights) {
        if (heights == null || heights.length == 0) {
            return -1;
        }
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int numberOfPlayers = 11;
        int[] playerHeights = generatePlayerHeights(numberOfPlayers);

        System.out.println("Player Heights (cm): " + Arrays.toString(playerHeights));

        int totalHeightSum = calculateSum(playerHeights);
        double meanHeight = calculateMeanHeight(playerHeights);
        int shortestHeight = findShortestHeight(playerHeights);
        int tallestHeight = findTallestHeight(playerHeights);

        System.out.println("Sum of all heights: " + totalHeightSum + " cm");
        System.out.printf("Mean height: %.2f cm%n", meanHeight);
        System.out.println("Shortest height: " + shortestHeight + " cm");
        System.out.println("Tallest height: " + tallestHeight + " cm");
    }
}
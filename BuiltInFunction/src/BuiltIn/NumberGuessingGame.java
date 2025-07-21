package BuiltIn;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Think of a number between 1 and 100.");

        playGame(scanner);

        scanner.close();
    }

    public static void playGame(Scanner scanner) {
        int low = 1;
        int high = 100;
        Random random = new Random();
        String feedback = "";
        int guessCount = 0;

        while (!feedback.equalsIgnoreCase("correct")) {
            int guess = generateGuess(low, high, random);
            guessCount++;
            System.out.println("My guess is: " + guess);
            System.out.print("Is it (high/low/correct)? ");
            feedback = scanner.next();

            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (!feedback.equalsIgnoreCase("correct")) {
                System.out.println("Invalid feedback. Please enter high, low, or correct.");
            }

            if (low > high) {
                System.out.println("It seems there's an issue with your feedback or your number is outside the initial range. Exiting.");
                break;
            }
        }
        if (feedback.equalsIgnoreCase("correct")) {
            System.out.println("I guessed your number (" + (low == high ? low : "unknown") + ") in " + guessCount + " tries!");
        }
    }

    public static int generateGuess(int low, int high, Random random) {
        // Simple random guess within the current range
        return low + random.nextInt(high - low + 1);
    }
}

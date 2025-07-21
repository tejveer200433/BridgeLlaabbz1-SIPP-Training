package BuiltIn;

import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = getInputNumber(scanner, "Enter a non-negative integer to calculate its factorial: ");

        if (number < 0) {
            displayOutput("Factorial is not defined for negative numbers.");
        } else {
            long result = calculateFactorial(number);
            displayOutput("The factorial of " + number + " is: " + result);
        }

        scanner.close();
    }

    public static int getInputNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void displayOutput(String message) {
        System.out.println(message);
    }
}
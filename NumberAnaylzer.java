package methodinjava;

import java.util.Scanner;

public class NumberAnaylzer {

    public static String checkPositiveNegative(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static int compareNumbers(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            String positivity = checkPositiveNegative(numbers[i]);
            System.out.print("Number " + numbers[i] + " is " + positivity);

            if (positivity.equals("positive")) {
                String evenOdd = checkEvenOdd(numbers[i]);
                System.out.println(" and it is " + evenOdd + ".");
            } else {
                System.out.println(".");
            }
        }

        System.out.println("\nComparing first and last elements:");
        int comparisonResult = compareNumbers(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first element (" + numbers[0] + ") is greater than the last element (" + numbers[numbers.length - 1] + ").");
        } else if (comparisonResult == -1) {
            System.out.println("The first element (" + numbers[0] + ") is less than the last element (" + numbers[numbers.length - 1] + ").");
        } else {
            System.out.println("The first element (" + numbers[0] + ") is equal to the last element (" + numbers[numbers.length - 1] + ").");
        }

        input.close();
    }
}
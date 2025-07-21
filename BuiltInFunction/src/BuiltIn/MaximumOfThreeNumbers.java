package BuiltIn;

import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = getInput(scanner, "Enter the first integer: ");
        int num2 = getInput(scanner, "Enter the second integer: ");
        int num3 = getInput(scanner, "Enter the third integer: ");

        int maximum = calculateMaximum(num1, num2, num3);
        System.out.println("The maximum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + maximum);

        scanner.close();
    }

    public static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int calculateMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}

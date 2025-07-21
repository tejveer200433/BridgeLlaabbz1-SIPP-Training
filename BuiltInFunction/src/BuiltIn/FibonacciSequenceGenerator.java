package BuiltIn;

import java.util.Scanner;

public class FibonacciSequenceGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();

        printFibonacciSequence(terms);

        scanner.close();
    }

    public static void printFibonacciSequence(int terms) {
        if (terms <= 0) {
            System.out.println("Number of terms must be positive.");
            return;
        }

        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence (up to " + terms + " terms): ");

        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        System.out.println();
    }
}

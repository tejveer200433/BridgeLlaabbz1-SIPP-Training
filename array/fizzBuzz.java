package array;

import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            String[] results = new String[number + 1];

            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = String.valueOf(i);
                }
            }

            for (int i = 0; i <= number; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        }

        scanner.close();
    }
}

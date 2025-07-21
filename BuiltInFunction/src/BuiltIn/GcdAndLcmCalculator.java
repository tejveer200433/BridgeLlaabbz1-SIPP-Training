package BuiltIn;

import java.util.Scanner;

public class GcdAndLcmCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // GCD is always non-negative
    }

    public static int calculateLCM(int a, int b) {
        if (a == 0 || b == 0) {
            return 0; // LCM is 0 if either number is 0
        }
        return Math.abs(a * b) / calculateGCD(a, b);
    }
}

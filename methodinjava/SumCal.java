package methodinjava;

import java.util.Scanner;

class SumCal {

    public int calculateSumOfNNumbers(int n) {
        if (n < 0) {
            System.out.println("Please enter a non-negative number.");
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumCal calculator = new SumCal();

        System.out.print("Enter a positive integer (n) to find the sum of natural numbers up to n: ");
        int n = scanner.nextInt();

        int sum = calculator.calculateSumOfNNumbers(n);

        if (n >= 0) {
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }
}
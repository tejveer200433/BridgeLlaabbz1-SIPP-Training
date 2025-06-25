package methodinjava;

import java.util.Scanner;

public class Remainder {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            int[] result = findRemainderAndQuotient(dividend, divisor);
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        input.close();
    }
}
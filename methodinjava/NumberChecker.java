package methodinjava;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class NumberChecker {

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        long tempNum = Math.abs((long) number);
        while (tempNum > 0) {
            tempNum /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        if (number == 0) {
            return new int[]{0};
        }
        long tempNum = Math.abs((long) number);
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = (int) (tempNum % 10);
            tempNum /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        if (digits.length == 1 && digits[0] == 0) {
            return false;
        }
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        if (number < 0) {
            return false;
        }
        if (digits == null || digits.length == 0) {
            return false;
        }

        int numDigits = digits.length;
        long sumOfPowers = 0;

        for (int digit : digits) {
            sumOfPowers += Math.pow(digit, numDigits);
        }

        return sumOfPowers == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        if (digits == null || digits.length < 2) {
            return new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        if (digits == null || digits.length < 2) {
            return new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Count of digits in " + number + ": " + digitCount);

        int[] digitsArray = storeDigits(number);
        System.out.print("Digits of " + number + ": [");
        for (int i = 0; i < digitsArray.length; i++) {
            System.out.print(digitsArray[i] + (i == digitsArray.length - 1 ? "" : ", "));
        }
        System.out.println("]");

        if (isDuckNumber(digitsArray)) {
            System.out.println(number + " is a Duck Number.");
        } else {
            System.out.println(number + " is not a Duck Number.");
        }

        if (isArmstrongNumber(number, digitsArray)) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }

        if (digitsArray.length >= 2) {
            int[] largestAndSecondLargest = findLargestAndSecondLargest(digitsArray);
            System.out.println("Largest digit: " + largestAndSecondLargest[0]);
            System.out.println("Second largest digit: " + largestAndSecondLargest[1]);
        } else if (digitsArray.length == 1) {
            System.out.println("Only one digit: " + digitsArray[0] + ". No second largest.");
        } else {
            System.out.println("No digits to analyze for largest/second largest.");
        }

        if (digitsArray.length >= 2) {
            int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digitsArray);
            System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
            System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
        } else if (digitsArray.length == 1) {
            System.out.println("Only one digit: " + digitsArray[0] + ". No second smallest.");
        } else {
            System.out.println("No digits to analyze for smallest/second smallest.");
        }

        scanner.close();
    }
}

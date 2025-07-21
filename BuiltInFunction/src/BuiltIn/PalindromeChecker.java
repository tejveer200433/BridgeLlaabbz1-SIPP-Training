package BuiltIn;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = getInputString(scanner, "Enter a string to check if it's a palindrome: ");

        if (isPalindrome(inputString)) {
            displayResult(inputString, true);
        } else {
            displayResult(inputString, false);
        }

        scanner.close();
    }

    public static String getInputString(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove non-alphanumeric and convert to lowercase
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(String originalString, boolean isPal) {
        if (isPal) {
            System.out.println("'" + originalString + "' is a palindrome.");
        } else {
            System.out.println("'" + originalString + "' is not a palindrome.");
        }
    }
}
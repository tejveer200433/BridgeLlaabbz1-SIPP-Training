package methodinjava;

import java.util.Scanner;

class VoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        } else return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];
        VoteChecker checker = new VoteChecker();

        System.out.println("Enter the ages of 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            studentAges[i] = scanner.nextInt();
        }

        System.out.println("\n--- Voting Eligibility Results ---");
        for (int i = 0; i < 10; i++) {
            boolean canVote = checker.canStudentVote(studentAges[i]);
            System.out.print("Student " + (i + 1) + " (Age: " + studentAges[i] + "): ");
            if (canVote) {
                System.out.println("Can Vote");
            } else {
                System.out.println("Cannot Vote");
            }
        }

        scanner.close();
    }
}
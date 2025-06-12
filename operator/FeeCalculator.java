package operator;

import java.util.Scanner;

public class FeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fee;
        System.out.print("Enter student fee: ");
        fee = scanner.nextDouble();

        double discountPercent;
        System.out.print("Enter university discount percentage: ");
        discountPercent = scanner.nextDouble();

        double discount = fee * (discountPercent / 100);
        double feeToPay = fee - discount;

        System.out.println("Fee to pay after discount: " + feeToPay);

        scanner.close();
    }
}

package methodinjava;

import java.util.Scanner;

public class Interest {

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("interest Rate (in percentage): ");
        double rate = input.nextDouble();

        System.out.print("Time (in years): ");
        double time = input.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f%% and Time %.2f years.%n",
                simpleInterest, principal, rate, time);

        input.close();
    }
}
package BuiltIn;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = fahrenheitToCelsius(fahrenheit);
                System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, celsius);
                break;
            case 2:
                System.out.print("Enter temperature in Celsius: ");
                double celsiusInput = scanner.nextDouble();
                double fahrenheitOutput = celsiusToFahrenheit(celsiusInput);
                System.out.printf("%.2f°C is equal to %.2f°F%n", celsiusInput, fahrenheitOutput);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

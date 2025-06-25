package methodinjava;

import java.util.Random;

public class RandomNumberAnylzer {

    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = rand.nextInt(9000) + 1000;
        }
        return randomNumbers;
    }

    public double[] findAverageMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new double[]{0.0, 0.0, 0.0};
        }

        int minVal = numbers[0];
        int maxVal = numbers[0];
        long sum = 0;

        for (int number : numbers) {
            sum += number;
            minVal = Math.min(minVal, number);
            maxVal = Math.max(maxVal, number);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, minVal, maxVal};
    }

    public static void main(String[] args) {
        RandomNumberAnylzer analyzer = new RandomNumberAnylzer();
        int arraySize = 5;

        int[] randomValues = analyzer.generate4DigitRandomArray(arraySize);

        System.out.println("Generated 4-digit random values:");
        for (int i = 0; i < randomValues.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + randomValues[i]);
        }

        double[] results = analyzer.findAverageMinMax(randomValues);
        System.out.printf("\nAverage value: %.2f%n", results[0]);
        System.out.println("Minimum value: " + (int) results[1]);
        System.out.println("Maximum value: " + (int) results[2]);
    }
}
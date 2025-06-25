package methodinjava;

import java.util.Scanner;

public class ChoclateDistribution {

    public static int[] findChocolatesPerChildAndRemaining(int totalChocolates, int numberOfChildren) {
        int chocolatesPerChild = totalChocolates / numberOfChildren;
        int remainingChocolates = totalChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of chocolates (N): ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children (M): ");
        int numberOfChildren = input.nextInt();

        if (numberOfChildren <= 0) {
            System.out.println("Error: The number of children must be greater than zero.");
        } else {
            int[] result = findChocolatesPerChildAndRemaining(numberOfChocolates, numberOfChildren);
            System.out.println("Each child will get: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        input.close();
    }
}

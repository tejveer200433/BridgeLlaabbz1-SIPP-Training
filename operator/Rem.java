package operator;


	import java.util.Scanner;
	public class Rem{

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Program to calculate total price
	        double unitPrice = scanner.nextDouble();
	        int quantity = scanner.nextInt();

	        double totalPrice = unitPrice * quantity;

	        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

	        
	        int number1 = scanner.nextInt();
	        int number2 = scanner.nextInt();

	        int quotient = number1 / number2;
	        int remainder = number1 % number2;

	        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);

	        scanner.close();
	    
	}
	}


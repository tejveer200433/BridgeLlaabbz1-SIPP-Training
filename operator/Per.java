package operator;

	import java.util.Scanner;

	public class Per {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        float number1;
	        float number2;

	        number1 = scanner.nextFloat();
	        number2 = scanner.nextFloat();

	        float sum = number1 + number2;
	        float difference = number1 - number2;
	        float product = number1 * number2;
	        float quotient = number1 / number2;

	        System.out.println("The addition, subtraction, multiplication, and division value of " + number1 + " and " + number2 + " is " + sum + ", " + difference + ", " + product + ", and " + quotient);

	        scanner.close();
	    }
	}


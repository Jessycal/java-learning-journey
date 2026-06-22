//addition of numbers
import java.util.Scanner;
public class Addition2 {
	public static void main(String[] args) {
		//create an object from scanner
		Scanner input = new Scanner (System.in);
		System.out.print("Enter first number: ");
		int number1 = input.nextInt();
		System.out.print("Enter second number: ");
		int number2 = input.nextInt();
		int sum = number1 + number2;
		int sub = number1 - number2;
		int prod = number1 * number2;
		double quotient = (double) number1 / number2;
		System.out.println("Addition answer is: " + sum);
		System.out.println("subtraction answer is: " + sub);
		System.out.println("product is " + prod);
		System.out.println("Division answer is: " + quotient);


	}
}
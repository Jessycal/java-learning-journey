// compare integers using if statements, relational operators, equality operators

import java.util.Scanner;           //importing the scanner utility
public class Comparison {
	//Method begins
	public static void main(String[] args) {
			//create an object from the scanner class imported to receive inputs from the keyboard

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String FirstName = input.nextLine();
		System.out.print("Enter first Number: ");
		int number1 = input.nextInt();

		System.out.print("Enter second Number: ");
		int number2 = input.nextInt();

		if (number1 == number2) {
			System.out.printf("%d == %d%n", number1, number2);

		if (number1 != number2) {
			System.out.printf("%d != %d%n", number1, number2);
		}
		}


	}
}
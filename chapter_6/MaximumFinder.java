//this program uses a static method called Maximum and minimum belonging to class math.Lang to determine and return the largest
//and smallest double value

import java.util.Scanner;
public class MaximumFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//prompt for three floating point values
		System.out.print("Enter three floating values seprated by space: ");
		double number1 = input.nextDouble(); //read the first number
		double number2 = input.nextDouble(); //read the second number
		double number3 = input.nextDouble(); //read the third number

		//determine the maximum value
		double maximumValueResult = Math.max(Math.max(number1, number2), number3);
		double minimumValueResult = Math.min(Math.min(number1, number2), number3);
		//display the result
		System.out.println("The Maximum number is: " + maximumValueResult);
		System.out.println("The minimum number is: " + minimumValueResult);
	}
}
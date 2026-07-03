//MaxMinFinderCustom.java
// This program demonstrates how to write custom static methods from scratch
// (without using Java's built-in Math.max and Math.min) to determine
// the largest and smallest of three double values entered by the user.

import java.util.Scanner;

public class MaxMinFinderCustom{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//prompt the user to enter three values and read it

		System.out.println("Enter three values: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		//determine the maximum result
		double maximumValue = maximum(number1, number2, number3);
		double minimumValue = minimum(number1, number2, number3);

		System.out.println("The Maximum number entered is: " + maximumValue);
		System.out.println("The minimum number Entered is: " + minimumValue);
	}

	//building maximum method
	public static double maximum(double x, double y, double z) {
		double maximumNumber = x;

		if (y > maximumNumber) {
			maximumNumber = y;
		}
		if ( z > maximumNumber) {
			maximumNumber = z;
		}
		return maximumNumber;
	}

	//building minimum method
	public static double minimum(double x, double y, double z) {
		double minimumNumber = x;
		if (y < minimumNumber) {
			minimumNumber = y;
		}

		if (z < minimumNumber) {
			minimumNumber = z;
		}
		return minimumNumber;
	}
}
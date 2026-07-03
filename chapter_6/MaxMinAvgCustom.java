//a program to find the max, min, avg of three values building the method from scratch
import java.util.Scanner;
public class MaxMinAvgCustom {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter four Numbers to find the Max: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		double number4 = input.nextDouble();

		double result = maximum(number1,number2,number3, number4);
		double min = minimum(number1, number2, number3, number4);
		double avg = average(number1, number2, number3, number4);
		System.out.println("The Maximum number is: " + result);
		System.out.println("The Minimum number is: " + min);
		System.out.println("The average number is: " + avg);
	}
	public static double maximum(double x, double y, double z, double a) {
		double maxFinder = x;
		if (y > maxFinder) {
			maxFinder = y;
			System.out.println("the second number is: " + y);
		}
		if (z > maxFinder) {
			maxFinder = z;
		}
		if (a > maxFinder) {
			maxFinder = a;
		}
		return maxFinder;
	}

	public static double minimum(double x, double y, double z, double a) {
		double minFinder = x;
		if (y < minFinder) {
			minFinder = y;
		}
		if (z < minFinder) {
			minFinder = z;
		}
		if (a < minFinder) {
			minFinder = a;
		}
		return minFinder;
	}
	public static double average(double x, double y, double z, double a) {
		double averageFinder = (x + y + z + a) / 4;
		return averageFinder;
	}
}
//a program that calculates Body mass index
import java.util.Scanner;
public class BmiCalculator {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("please enter your weight: ");
		double weight = input.nextDouble();
		System.out.print("please enter your height: ");
		double height = input.nextDouble();
		double result = (weight * 703) / (height * height);
		System.out.printf("%s%n%.2f%n", "Your BMI is: ", result);
		if (result < 18.5) {
			System.out.println("You are underweight!!!");
		}
		else if (result >= 18.5 && result <= 24.9) {
			System.out.println("Your BMI is normal");
		}
		else if (result >= 25. && result <= 29.9) {
			System.out.println("Your are overweight");
		}
		else if (result >= 30) {
			System.out.println("You are obese");
		}
		
		
		


	}
}
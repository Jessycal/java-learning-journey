/// RoundingNumbersDemo.java
// Demonstrates rounding a number to different levels of precision using
// the "add 0.5, then floor" rounding technique.
// Defines four methods:
//   - roundToInt          -> rounds to the nearest whole number
//   - roundToTenth        -> rounds to the nearest tenth (1 decimal place)
//   - roundToHundreth     -> rounds to the nearest hundredth (2 decimal places)
//   - roundToThousandth   -> rounds to the nearest thousandth (3 decimal places)
// Reads numbers from the user in a sentinel-controlled loop (ends on EOF)
// and displays the original number alongside all four rounded versions.
import java.util.Scanner;
public class RoundingNumbersDemo {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	double number = 0;
	double entryCounter = 0;

	System.out.println("*****************************");
	System.out.print("Enter Your number: ");

	while (input.hasNext()) {
		number = input.nextDouble();
		entryCounter = entryCounter + 1;

		double integerValue = roundToInt(number);
		double tenthValue = roundToTenth(number);
		double hundrethValue = roundToHundreth(number);
		double thousandthValue = roundToThousandth(number);

		System.out.println("The original Number is: " + number);
		System.out.println("The integer Value is: "   + integerValue);
		System.out.println("The Tenth value is:   "    + tenthValue);
		System.out.println("The Hundreth vale is:  "    + hundrethValue);
		System.out.println("The Thousandth Value is: "   + thousandthValue);

		System.out.println("*********************************************");
		System.out.println("Enter Your Number: ");


	}
}
	//integerValue method

	public static double roundToInt(double number) {
		return Math.floor(number + 0.5);
	}

	//tenthValue method
	public static double roundToTenth(double number) {
		return Math.floor(number *10 + 0.5)/10;
	}

	//hundreth value method
	public static double roundToHundreth(double number) {
		return Math.floor(number * 100 + 0.5)/100;
	}

	//thousandth value method
	public static double roundToThousandth(double number) {
		return Math.floor(number * 1000 + 0.5)/1000;
	}
}
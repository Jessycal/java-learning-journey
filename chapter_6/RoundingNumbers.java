// RoundingNumbersDemo.java
// Demonstrates rounding a number to different levels of precision using
// the "add 0.5, then floor" rounding technique.
//   - roundToInt          -> rounds to the nearest whole number
//   - roundToTenth        -> rounds to the nearest tenth (1 decimal place)
//   - roundToHundreth     -> rounds to the nearest hundredth (2 decimal places)
//   - roundToThousandth   -> rounds to the nearest thousandth (3 decimal places)
// Reads numbers from the user in a sentinel-controlled loop (ends on EOF)
// and displays the original number alongside all four rounded versions.
import java.util.Scanner;
public class RoundingNumbers {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double x = 0;
		double roundToInt = 0;
		double roundToTenth = 0;
		double roundToHundreth = 0;
		double roundToThousandth = 0;
		int entryCounter = 0;

		System.out.println("******************************");
		System.out.print("Enter Your Number: ");

		while (input.hasNext()) {
			x = input.nextDouble();
			entryCounter = entryCounter + 1;

			roundToTenth = Math.floor( x * 10 + 0.5)/ 10; //round to 10th
			roundToInt = Math.floor( x + 0.5); //round to integer
			roundToHundreth = Math.floor( x * 100 + 0.5)/100; //round to hundreth
			roundToThousandth = Math.floor(x * 1000 + 0.5)/ 1000; //round to thousandth

			System.out.println("The original Number is: " + x);
			System.out.println("The integer Value is: "   + roundToInt);
			System.out.println("The Tenth value is:   "    + roundToTenth);
			System.out.println("The Hundreth vale is:  "    + roundToHundreth);
			System.out.println("The Thousandth Value is: "   + roundToThousandth);



			System.out.println("************************************");
			System.out.println("Enter Your Number: ");
		}
		
}
}


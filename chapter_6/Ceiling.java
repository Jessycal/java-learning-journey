// Ceiling.java
// Demonstrates rounding a number to the nearest integer using the
// "add 0.5, then floor" technique: Math.floor(x + 0.5) rounds x to the
// nearest whole number, working correctly for both positive and negative
// values.
// Reads numbers from the user in a sentinel-controlled loop (ends on EOF),
// displaying each original number alongside its rounded result.
import java.util.Scanner;
public class Ceiling {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x = 0;
		double resultX = 0;
		int entryCounter = 0;

		System.out.println("**********************************");
		System.out.println("Press CTRL D to indicate end of data entry");
		System.out.print("Enter your numbers:");




		while (input.hasNext()) {

            x = input.nextDouble();
            entryCounter = entryCounter + 1;
			resultX = Math.floor( x + 0.5);

		System.out.println("The original number is: " + x);
		System.out.println("The rounded number is:  " +  resultX);

		System.out.println("**********************************");


		System.out.print("Enter your numbers: ");
	}
		}

		
	}

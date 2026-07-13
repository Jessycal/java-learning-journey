// GarageCharge.java
// Simulates a parking garage's daily billing system.
// Charges a flat $2.00 fee for up to 3 hours of parking, plus $0.50 for
// each additional hour (or part of an hour) beyond that, capped at a
// maximum charge of $10.00 per customer for any 24-hour period.
// Reads hours parked for each customer using a sentinel-controlled loop
// (ends on EOF), displays each customer's charge, and prints a running
// total of the day's receipts once all customers have been entered.
// Uses the method calculateCharges to compute each customer's fee.
import java.util.Scanner;
public class GarageCharge {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hourCounter = 0;
		double total = 0;

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@ Welcome to chi's Autos@@@@@@@@@@@@"); 
		System.out.println("\nType the end-of-file indicator to terminate input: ");
		System.out.println("\nOn UNIX/Linux/macOS type <Ctrl> d then press Enter");
		System.out.println("\n Windows type <Ctrl> z then press Enter");

		//creating the setinel value to indicate end of hours entry
		while (input.hasNext()) {
			System.out.println("##########################################################");
			System.out.println("Enter hours parked in the range of 1 -23");
			double hoursParked = input.nextDouble(); //read hours
			 hourCounter = hourCounter + 1;
			 double customerCharge = calculateCharges(hoursParked);

			 System.out.println("@@@@@@@@Amount@@@@@@");
		     System.out.println("Your hours parked is: " + hoursParked);
		    System.out.println("Your amount is: " + customerCharge);

		    total = total + customerCharge;


		}
		System.out.println("------------End of the day summary------------------------------------------");
		System.out.println("Total receipts for the day is: " + total);


	}

	public static double calculateCharges(double hoursParked) {
		double baseCharge = 2.00;
		double amount;
		double maximumAmount = 10.00;

		if (hoursParked <= 3) {
			amount = baseCharge;
		}
		else {
			double extraHours = Math.ceil(hoursParked -3);
			double extraCharge = extraHours * 0.50;
			amount = baseCharge + extraCharge;
		}
		//calculating to peg the maximum charge to 10.00
		if (amount > maximumAmount) {
			return maximumAmount;
		}
		else {
			return amount;
		}
}
}
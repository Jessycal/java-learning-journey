/* Gas mileage
input miles driven and gallons of gas used data types:integer
for each trip calculate and display the miles per gallon 
and calculate the miles per gallons for all trips
all averaging calculations should produce float points results
the setinel controlled iteration should be used
*/

import java.util.Scanner;

public class GasMileage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        //initialization phase
		int totalMiles = 0;
		int totalGallons = 0;

		//read first user input before the start of loop
		System.out.print("Enter miles driven with the exception of -1");
		int miles = input.nextInt();

		//processing phase
		while (miles != -1) {
			System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

			//this trip's own
			double tripMilesPerGallon = (double) miles / (double) gallons;

			//totals accross all 
			totalMiles = totalMiles + miles;
			totalGallons = totalGallons + gallons;

			//double combination

			double combinedTrip = totalMiles/totalGallons;

			System.out.println("This trips's MPG is: " + tripMilesPerGallon);
			System.out.println("This trip's CMPG: " + combinedTrip);

			//read next trip mile
			System.out.print("Enter miles driven with the exception of -1");
		     miles = input.nextInt();


		}


	}
}
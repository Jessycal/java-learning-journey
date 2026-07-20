/* A controlled loop is used because number of iteration is known which is 10
the message "Enter your result should be displayed to take input"
the analysis is based on a 1 for pass a 2 for fail and based on the input count the number of pass and fail
display a summary for number of people who passed and failed
to determine pass if more than 8 people out of the 10 have a 1 then it is pass and this message "bonus to the instructor"
is printed out.*/

import java.util.Scanner;
public class LicensingExamAnalysis {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
         //initialization phase
		int pass = 0;
		int fail = 0;
		int studentCounter = 1;

		//processing phase
		while ( studentCounter <= 10) {
			System.out.print("Enter result (1 = pass, 2 = fail) : ");
			int result = input.nextInt();

			if (result == 1) {
				pass += 1;
			}
			else {
				fail += 1;
			}
			studentCounter +=  1;

		}
		//termination phase
		System.out.println("Number of passes is: " + pass );
		System.out.println("Number of fail is: " + fail);

		//determine more than 8 people passed
		if (pass > 8) {
			System.out.println("**********weldone Tutor!!");
		}
		else {
			System.out.println(" poor performance");
		}

		}

	}

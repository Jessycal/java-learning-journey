//calculating class average using setinel controlled iteration

import java.util.Scanner;

public class AverageSetinel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

         //initialization phase
		int total = 0;
		int gradeCounter = 0;

		System.out.print("Enter grade or -1 to quit: ");
		int grade = input.nextInt();


		//processing phase
		while (grade != -1) {
			total = total + grade;
			gradeCounter = gradeCounter + 1; //increment counter

			// read next grade from user
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();


		}

		//termination phase

		//if user entered at least one grade
		if (gradeCounter != 0) {
			double average = (double) total / gradeCounter;

			//display total and average
		System.out.println("**********************************Result**************************************");
		System.out.println("Total grade is: " + total);
		System.out.println("Average class result is: " + average);



		}
		else {
			System.out.println("No grades were entered. ");
		}


	}
}
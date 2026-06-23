/*  finding the average grade of a class using counter-controlled iteration
   counter-controlled iteration is used to input the grade one at a time
 this program goes through three phases:

 initialization phase   →   setting up variables before the loop starts
processing phase        →   the loop itself, doing the repeated work
termination phase       →   wrapping up after the loop ends */


import java.util.Scanner;

public class ClassAverageCalculation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//initialization phase
		int total = 0;  //the variable that will hold the running sum of every grade entered, starts at 0 because nothing has been entered
		int gradeCounter = 1; //a counter that tracks the number of grade entered

		//processing phase uses controlled loop iteration
		while (gradeCounter <=10) {
			System.out.print("Enter Grade: ");
			int grade = input.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
		}

		//termination phase
		double average = (double) total / 10;

		//display total and average grade score
		System.out.println("***********************************Result***************************************");
		System.out.println("Total is: " + total);
		System.out.println("class average is: " + average);
	}
}
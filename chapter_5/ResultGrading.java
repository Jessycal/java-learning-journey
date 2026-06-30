//grading of result using the selection switch statement

import java.util.Scanner;
public class ResultGrading {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//declaring and initializing variables
		int total = 0;
		int gradeCounter = 0;
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int fCount = 0;

		System.out.println("Enter the integer grades in the range 0-100.");
		System.out.println("\nType the end-of-file indicator to terminate input: ");
		System.out.println("\nOn UNIX/Linux/macOS type <Ctrl> d then press Enter");
		System.out.println("\n Windows type <Ctrl> z then press Enter");

		//creating the setinel value to indicate end of grade entry

		while (input.hasNext()) {
			System.out.println("Enter the Grades: ");
			int grade = input.nextInt(); //read grades
			//setting increment to the counter gradecounter
			total = total + grade;
			gradeCounter = gradeCounter + 1;

			switch (grade / 10 ) {
			case 9: //grade between 100 and 90
			case 10:
				aCount = aCount + 1;
				break; //exits switch

			case 8: //grade  between 80
				bCount = bCount + 1; //increment
				break; //exits switch

			case 7: //grade between 70
				cCount = cCount + 1;
				break;

			case 6:
				dCount = dCount + 1;
				break;

			default: //grades less than 60
				fCount = fCount + 1;
				break;


			}
		}

		//Grade display
		System.out.println("\nGrade Report: ");

		//if user entered atleast one value

		if (gradeCounter != 0) {
			//calculate average
			double average = (double) total / gradeCounter;
			//display results

			System.out.println("\nTotal of the grades entered are: " + gradeCounter);
			System.out.println("\nAverage is: " + average);
			
			System.out.println("\nNumber of students who received each grade:");
			System.out.println("A: " + aCount);
			System.out.println("B: " + bCount);
			System.out.println("C: " + cCount);
			System.out.println("D: " + dCount);
			System.out.println("F: " + fCount);

		}
	}
}
//Grading report using switch
import java.util.Scanner;
public class ExamAnalysis {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int pass = 0;
		int fail = 0;
		int total = 0;
		int gradeCounter = 0;

		System.out.println("Enter the integer grades in the range 0-100.");
		System.out.println("\nType the end-of-file indicator to terminate input: ");
		System.out.println("\nOn UNIX/Linux/macOS type <Ctrl> d then press Enter");
		System.out.println("\n Windows type <Ctrl> z then press Enter");


		
			//creating the setinel value to indicate end of grade entry
			while (input.hasNext()) {
				System.out.println("Enter the grades: ");
				int result = input.nextInt(); //read grades
				gradeCounter = gradeCounter + 1;
				 

				 switch ( result) {
				 case 1:
				 	pass = pass + 1;
				 	break;

				 case 2:
				 	fail = fail + 1;
				 	break;

				 default:
				 	break;
				 } 
			}

			//grade report
		System.out.println("\n@@@@@@@@@@@@@@Report@@@@@@@@@@@@@@@@@@@@");

		//if user entered at least one value

		if (gradeCounter != 0) {
			System.out.println("\nTotal grades entered are: " + gradeCounter);
			System.out.println("\nNumber of passes are: " + pass);
			System.out.println("\nNumber of fails are: " + fail);

		}

		//determine more than 8 people passed
		if (pass > 8) {
			System.out.println("\n@@@@ well done tutor!!!");
		}
		else {
			System.out.println("\npoor performance");

		}

		
		}


	}

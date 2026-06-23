import java.util.Scanner;

public class CounterLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	//initialization phase
	int total = 0;
	int gradeCounter = 1;

	//processing phase
	while (gradeCounter <=5) {
		System.out.print("Enter grade: ");
		int grade = input.nextInt();
		total = total + grade;
		gradeCounter = gradeCounter + 1;
	}

	//termination phase
	double average = (double) total / 5;

	System.out.println("**********************************Result**************************************");
	System.out.println("Total is: " + total);
	System.out.println("Average is: " + average);
	}
}
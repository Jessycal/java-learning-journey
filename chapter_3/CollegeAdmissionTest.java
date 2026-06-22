import java.util.Scanner;

public class CollegeAdmissionTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CollegeAdmission student1 = new CollegeAdmission();
		CollegeAdmission student2 = new CollegeAdmission();

        System.out.println("-----Student1 ---------");
		System.out.println("Enter your name:");
		String studentName = input.nextLine();

		System.out.println("Enter your age: ");
		int studentAge = input.nextInt();

		System.out.println("Enter your score: ");
		double studentScore = input.nextDouble();
		input.nextLine(); //clear the buffer

		//store student1 details using setters
		student1.setName(studentName);
		student1.setAge(studentAge);
		student1.setScore(studentScore);

		//get student2 details
		System.out.println("----- student2 ------");
		System.out.print("Enter your name: ");
		String studentName2 = input.nextLine();

		System.out.print("Enter your age: ");
		int studentAge2 = input.nextInt();

		System.out.print("Enter your score: ");
		double studentScore2 = input.nextDouble();

		//store student2 details using setters
		student2.setName(studentName2);
		student2.setAge(studentAge2);
		student2.setScore(studentScore2);

		//display student1 using getters
		System.out.println("\n---student1 result----");
		System.out.println("Name: " + student1.getName());
		System.out.println("Age: " + student1.getAge());
		System.out.println("Score: " + student1.getScore());
		System.out.println("Grade: " + student1.getGrade());

		//display student2 using getters
		System.out.println("\n---student2 result----");
		System.out.println("Name: " + student2.getName());
		System.out.println("Age: " + student2.getAge());
		System.out.println("Score: " + student2.getScore());
		System.out.println("Grade: " + student2.getGrade());





	}
}
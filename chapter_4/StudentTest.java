//create and test student object
import java.util.Scanner;    

public class StudentTest {
	public static void main(String[] args) {
		//creating objects
		Scanner input = new Scanner(System.in);
		


		System.out.println("-----------Result checking portal-------");
		System.out.print("Enter your Name: ");
		String name1 = input.nextLine();
		System.out.print("Enter your average: ");
		double average1 = input.nextDouble();
      input.nextLine(); //clear buffer

      Student student1 = new Student(name1, average1);

		

		//display result using getters
		System.out.println("\n----Your result-----");
		System.out.println("Name: " + student1.getName());
		System.out.println("Result: " + student1.getLetterGrade());
	}
}
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double x;
		double y;
		double z;
		System.out.println("***************************************************");
		System.out.println("Enter three numbers to find the average:  ");
		x = input.nextDouble();
		y = input.nextDouble();
		z = input.nextDouble();

		double average = averageMethod(x,y,z);
		System.out.println("The average is: " + average);
		

	}
	//method to compute and return the average 
	public static double averageMethod(double number1, double number2, double number3) {
		double avgResult = (number1 + number2 + number3) / 3;
		return avgResult;
	}
}
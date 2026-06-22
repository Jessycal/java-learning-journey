//program that will calculate the product of three numbers
import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the first integer: ");
		int x = input.nextInt();
		System.out.print("Enter the second integer: ");
		int y = input.nextInt();
		System.out.print("Enter the third integer: ");
		int z = input.nextInt();
		int result = x * y * z;
		System.out.printf("%s %d%n", "Product is",  result);

	}
}
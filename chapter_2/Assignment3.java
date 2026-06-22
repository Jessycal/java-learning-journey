// program performs a sample payroll calculation
import java.util.Scanner;
public class Assignment3 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	System.out.print("Enter an integer: ");
	int b = input.nextInt();
	System.out.print("Enter an integer: ");
	int c = input.nextInt();
	int a = b * c;
	System.out.printf("%s %d%n", "Product is",  a);

	}

}
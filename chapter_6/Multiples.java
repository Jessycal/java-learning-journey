
import java.util.Scanner;
public class Multiples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int valueA = 0;
		int valueB = 0;
		int entryCounter= 0;

		System.out.println("*******************************************");
		System.out.print("Enter Your Numbers: ");

		while (input.hasNext()){

			
			valueA = input.nextInt();
			valueB = input.nextInt();
			entryCounter = entryCounter + 1;

			boolean multiple = isMultiples(valueA, valueB);

			System.out.println("The number is a multiple or not: " + multiple);

			System.out.println("*******************************************");
			System.out.print("Enter Your Number: ");

		}

	}

	public static boolean isMultiples( int x, int y) {
		if ( y != 0 && x % y == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}

import java.util.Scanner;
public class SquareOfAsterisks {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int entryCounter = 0;
		int squareNumber = 0;
		char star = '*'

		System.out.print("Enter Your Number: ");
		while (input.hasNext()) {
			squareNumber = input.nextInt();
			entryCounter = entryCounter + 1;

			double squareDisplay = asteriks(squareNumber);

			System.out.println("The asteriks of the square is: " + squareDisplay);

			System.out.println("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|");
			System.out.print("Enter Your Number: ");



		}
	}

	public static double asteriks(int asteriksMethod) {
		double display = Math.sqrt(asteriksMethod);
		return display;
	}
}
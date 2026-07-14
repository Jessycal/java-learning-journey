//EvenNumberDetermination.java
//A program to determine if the number being read is an even number 
//Return TRUE if it is
//else FALSE if it is not
//This program uses the While setinel loop since the number to be entered is not known in advance
//A isEven method is created to determine if the number is even
//The mainnmethod calls the isEven method

import java.util.Scanner;
public class EvenNumberDetermination {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int entryCounter = 0;
		int evenNumber = 0;

		System.out.println("****************************************");
		System.out.println("Press CTRL d to indicate End of Data Entry");
		System.out.print("Enter Your Number to determine if it is Even or Not: ");

		while (input.hasNext()) {
			evenNumber = input.nextInt();
			entryCounter = entryCounter + 1;

			boolean evenDeterminationMain = isEven(evenNumber);

			System.out.println("The Number Entered is Even true or false: " + evenDeterminationMain);

			System.out.println("***********************************************");
			System.out.print("Enter Your Number to determine if it is Even or Not: ");


		}
	}

	//isEven Method
	public static boolean isEven(int evenNumbers) {
		if ( evenNumbers % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
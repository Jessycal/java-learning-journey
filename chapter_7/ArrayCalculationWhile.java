/*this program calculates the values to be placed in the elements of an array
using the while loop statement */
public class ArrayCalculationWhile {
	public static void main(String[] args) {
		final int FINAL_LENGTH = 10;//constant variable declaration and initialization

		//creating object
		int [] arrayEvenNumber = new int[FINAL_LENGTH];

		//calculating the data
		int counter = 0;

		while ( counter < arrayEvenNumber.length ) {
			arrayEvenNumber[counter] = 2 + 2 * counter;
			counter++;
		}

		System.out.println("***********EVEN NUMBERS ARRAY VALUE CALCULATION DISPLAY******");
		    System.out.printf("%s%8s%n", "Index",     "Value"); // column headings

		 // display the data
		    counter = 0;
		    while (counter< arrayEvenNumber.length) {
		    		System.out.println(" [" + counter + "] = " + arrayEvenNumber[counter]);
		    		counter++;



		    }


	}
}

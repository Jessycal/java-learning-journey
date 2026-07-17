/*this program calculates the values to be placed in the elements of an array
-> Why two separate loops for each array object?
First loop: Build the data (calculate).
Second loop: Display the data.*/


public class ArrayCalculated {
	public static void main(String[] args) {
		final int FINAL_ARRAY = 10; //a constant variable

		//creating objects
		int []arrayEvenNumber = new int [FINAL_ARRAY];
		int []arrayoddNumber = new int[FINAL_ARRAY];
		int []arrayMultiplesOfFive = new int[FINAL_ARRAY];

		//building the value that will be entered into the element calculation{EVEN NUMBERS}
		for (int counter = 0; counter < arrayEvenNumber.length; counter++) {
			arrayEvenNumber[counter] = 2 + 2 * counter;

			
		}

            System.out.println("***********EVEN NUMBERS ARRAY VALUE CALCULATION DISPLAY******");
		    System.out.printf("%s%8s%n", "Index",     "Value"); // column headings

		    //display the data
		    for (int counter = 0; counter < arrayEvenNumber.length; counter++) {
		    	System.out.println(" [" + counter + "] = " + arrayEvenNumber[counter]);
		    }

		//odd numbers value calculation
		    for (int counter = 0; counter < arrayoddNumber.length; counter++) {
		    	arrayoddNumber[counter] = 2 * counter + 1;
		    }
		    System.out.println("***********ODD NUMBERS ARRAY VALUE CALCULATION DISPLAY******");
		    System.out.printf("%s%8s%n", "Index",     "Value"); // column headings
		    //display odd numbers 
		    for (int counter = 0; counter < arrayoddNumber.length; counter++) {
		    			System.out.println(" [" + counter + "] = " + arrayoddNumber[counter]);


		    }

		    //calculate multiples of five values
		    for (int counter = 0; counter < arrayMultiplesOfFive.length; counter++) {
		    	arrayMultiplesOfFive[counter] = 5 * counter;
		    }

		    System.out.println("***********MULTIPLES OF 5 NUMBERS ARRAY VALUE CALCULATION DISPLAY******");
		    System.out.printf("%s%8s%n", "Index",     "Value"); // column headings

		    //display the value
		    for (int counter = 0; counter < arrayMultiplesOfFive.length; counter++ ) {
		    	System.out.println(" [" + counter + "] = " + arrayMultiplesOfFive[counter]);

		    }





	}
}
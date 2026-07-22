public class ArrayCalculatedEnhancedForLoop {
	public static void main(String[] args) {
		final int FINAL_ARRAY = 10; // a contant variable
		int [] arrayEvenNumber = new int [FINAL_ARRAY];

				//building the value that will be entered into the element calculation{EVEN NUMBERS}
		for (int number: arrayEvenNumber) {
			arrayEvenNumber[number] = 2 + 2 * [number];
		}

		System.out.println("***********EVEN NUMBERS ARRAY VALUE CALCULATION DISPLAY******");
		    System.out.printf("%s%8s%n", "Index",     "Value"); // column headings

		    //display the data
		    for (int number: arrayEvenNumber) {
		    	System.out.println(" [" + number + "] = " + arrayEvenNumber[number]);
		    }


	}
}
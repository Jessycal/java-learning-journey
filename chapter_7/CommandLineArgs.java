// Initializing an array using command-line arguments.
public class CommandLineArgs {
	public static void main(String[] args ) {

		//check the number of command line arguements typed in the terminal
		if (args.length != 3) {
			System.out.println("Please Enter three Numbers");
			System.out.println("an array size, initial value and increment");
		}
		else {
			
			int arrayLength = 0; //array size
			int initialValue = 0; //array initial value
			int incrementValue = 0; //increment value
		
		try {
			arrayLength = Integer.parseInt(args[0]);
			initialValue = Integer.parseInt(args[1]);
			incrementValue = Integer.parseInt(args[2]);
		}
		catch (NumberFormatException errorHandling) {
			System.out.println(errorHandling);
			return;
		}
		int array [] = new int [arrayLength];

			for (int counter = 0; counter < array.length; counter++) {
				array[counter] = initialValue + incrementValue * counter;
			}
			System.out.printf("%s%8s%n", "Index", "Value");
		    for (int counter = 0; counter < array.length; counter++) {
		    	System.out.println(" [" + counter + "] = " + array[counter]);
		    }
		}


	}
}

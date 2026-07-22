//this program demonstrates pass by value and pass by reference
//method main calls methods modifyArrays(pass by reference), it modifies the values in main
//method main also calls method modifyElement(pass by reference), it copies the values in main and doesnt ovveride it

public class PassArrays {
	public static void main(String[] args) {

		int [] arrays = {1, 2, 3, 4, 5, 6};
		System.out.println("The length of the array is : " + arrays.length);
		
		System.out.println("Effects of passing reference to entire array: ");
		System.out.println("The values of the original array are: ");
		System.out.println("************************************************");

		System.out.printf("%s%8s%n", "Index",     "Value"); // column headings


		//output original array elements using regular loop
		for (int counter = 0; counter < arrays.length; counter++) {
			System.out.println(" [" + counter + "] = " + arrays[counter]);


		}
		//output original array elements using enhanced for loop
		System.out.println("**********************************************");
		System.out.println("Using Enhanced for Loop, the values of the original array are: " );

		System.out.printf("%s%8s%n", "Value",   ""  ); // column headings

		for (int value: arrays) {
			         System.out.println(value);

		}

		//call method modifyArray
		modifyArray(arrays);
		System.out.println("the modified arrays are: ");
		//output the modified array
		for (int values: arrays) {
			System.out.println("The arrays are: " + values);
		}

		System.out.printf(
         "%n%nEffects of passing array element value:%n" +
         "array[3] before modifyElement: %d%n", arrays[3]);

		//modify element
		modifyElement(arrays[3]); //tries to modify element 3 in the array
		System.out.println("Array[3] after modification: " + arrays[3]);


   




	}
	public static void modifyArray(int [] array2) {
			for (int counter = 0; counter < array2.length; counter++) {
				array2[counter] *= 2; //this is a reference, it changes the values of the arrays in main multiplies by 2
			}
		}

		public static void modifyElement(int primitive) {
				primitive *= 5; //this doesnt change the values in main arrays, it copies the value
				System.out.println("********************************************************");
				System.out.println("Values arrays[3] in modifyElement are: " + primitive);

			}
		}

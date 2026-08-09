// Arrays class methods and System.arraycopy
import java.util.Arrays;
import java.util.Collections;

public class ArrayManipulations {
	public static void main(String[] args) {

		//sort array into ascending order
		Integer [] ascendingArray = {5, 6, 23, 98, 12, 54, 21};//Integer[] needed here for Collections.reverseOrder()
		Arrays.sort(ascendingArray);

		System.out.println("======== ARRAY SORT INTO ASCENDING ORDER ============");
		for (Integer value: ascendingArray) {
			System.out.println(value);
		}

		//ARRAY SORT INTO DESCENDING ORDER
		System.out.println("=========ARRAY SORT INTO DESCENDING ORDER ======");
		Arrays.sort(ascendingArray, Collections.reverseOrder());
		System.out.println(Arrays.toString(ascendingArray));

		// FILL 12 ELEMENT WITH 6

		System.out.println();
		System.out.println("============FILL ARRAY ========================");
		int [] arrayFill = new int [12];
		Arrays.fill(arrayFill, 6);
		System.out.println(Arrays.toString(arrayFill));

		//COPY ARRAY INTO ANOTHER ARRAY OF EQUAL LENGTH
		System.out.println();
		System.out.println("============COPY ARRAY ========================");
		int [] initialArray = {1, 2, 3, 4, 5};
		int [] copiedArray = new int[initialArray.length];
		System.arraycopy(initialArray ,0, copiedArray, 0, initialArray.length);
		System.out.println("Initial array:" + Arrays.toString(initialArray));
		System.out.println("copied array: " + Arrays.toString(copiedArray));

		//COPY ARRAY INTO ANOTHER ARRAY NOT OF EQUAL LENGTH
		System.out.println();
		System.out.println("============COPY ARRAY NOT OF EQUAL LENGTH ========================");
		int [] firstArray = {1, 2,3, 5,6};
		int [] partialArray = new int [2];
		System.arraycopy(firstArray, 2, partialArray, 0, 2);
		System.out.println("First array: " + Arrays.toString(firstArray));
		System.out.println("Partial Array: " + Arrays.toString(partialArray));

		//COMPARE ARRAY IF THEY ARE  EQUAL OR NOT
		System.out.println();
		System.out.println("=========COMPARE ARRAYS IF THEY ARE EQUAL OR NOT====================");
		boolean arrayCompare = Arrays.equals(firstArray, partialArray);
		 if (arrayCompare) {
		 	System.out.println("print the arrays are Equal");
		 }
		 else {
		 	System.out.println("No the arrays are not Equal");
		 }

		 //USING BINARY SEARCH TO SEARCH ELEMENTS IN A SORTED ARRAY
		 System.out.println();
		 System.out.println("=================BINARY SEARCH ON A SORTED ARRAY===========================");
		 int [] binaryArray = { 1, 2, 3, 4, 5, 6};
		 Arrays.sort(binaryArray); //sorting the array that binary search will be performed on
		 int location = Arrays.binarySearch(binaryArray, 5);
		 if (location >= 0) {
		 	System.out.println("found element 5 at: " + location);
		 }
		 else {
		 	System.out.println("Element Not found");
		 }

	}
}
/* PROBLEM STATEMENT:
  Perform the following tasks for an array called fractions:
1. Declare a constant ARRAY_SIZE that’s initialized to 10.
2. Declare an array with ARRAY_SIZE elements of type double,
and initialize the elements to 0.
3. Refer to array element 4.
4. Assign the value 1.667 to array element 9.
5. Assign the value 3.333 to array element 6.
6. Sum all the elements of the array, using a for statement. Declare
the integer variable x as a control variable for the loop */
public class Fractions {
	public static void main(String[] args) {
		final int  ARRAY_SIZE = 10;
		double [] fractionPart = new double [ARRAY_SIZE]; //casted to int because of 
		fractionPart [6] =  3.333;
		fractionPart [9] = 1.667;
		fractionPart[4] = 2;
		System.out.println(fractionPart[4]);
		double total = 0;		
		for (int counter = 0; counter < fractionPart.length; counter++) {
			total += fractionPart[counter];

		}
		System.out.println("The total is: " + total);
	}
}
//this program computes the sum of an array

public class ArraySum {
	public static void main(String[] args) {
		int [] arrayValue = {1, 2, 3, 5, 6, 8, 9};
		int total =0;

		for (int counter = 0; counter < arrayValue.length; counter++) {
			total += arrayValue[counter];
		}
		System.out.print("Total of the array is: " + total);
	}
}
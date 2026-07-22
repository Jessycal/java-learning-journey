//implementing this for loop in an enhanced for loop
// for (counter = 0; counter < array.length; counter ++) {
	
//}

public class EnhancedFor {
	public static void main(String[] args) {
		int [] arrayValues = {10, 20, 30, 40, 50};
		int total = 0;
		for (int number: arrayValues) {
			total += number;
		}
		System.out.println();
	}
}
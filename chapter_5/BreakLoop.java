//using the break statement to exit a for loop 

public class BreakLoop {
	public static void main(String[] args) {
		int count;
		for ( count = 1; count <= 10; count++) {
			if (count ==8) {
				break;
			}

			System.out.println(count);
		}
		System.out.println("\nBroke out of loop at count: " + count);
	}
}
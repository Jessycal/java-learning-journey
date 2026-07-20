//using the continue statement to continue a for loop statement
public class ContinueLoop {
	public static void main(String[] args) {
		int count;
		for (count = 1; count <= 10; count++) {
			if (count ==5) {
				continue;
			}
			System.out.println(count);
		}
		System.out.println("\ncounting continued at: " + count);
	}
}
//do-while iteration

public class DoWhileTest {
	public static void main(String[] args) {

		int counter = 1;
		do {
			System.out.printf("%d  ", counter);
			//System.out.println(counter);
			counter = counter + 1;

		}
		while (counter <= 10);
		System.out.println();

	}
}
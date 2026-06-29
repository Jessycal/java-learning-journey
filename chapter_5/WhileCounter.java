//using the while counter controlled loop to display numbers 1 to 10

public class WhileCounter{
	public static void main(String[] args) {
		//initialization
		int counter = 0;

		//processing
		while (counter < 10) {
			++counter; //increment which can still be written as counter = counter + 1;
			System.out.println("Your numbers are: " + counter);
		}
	}
}
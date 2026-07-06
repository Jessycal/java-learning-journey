//this program is a secure Random non deterministic
// shifted and scaled random integer


import java.security.SecureRandom;

public class SecureRandomDemo{
	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();

		//loop 20 times
		for ( int counter = 1; counter <= 20; counter = counter + 1) {
			//to pick random integers from one to 6. 6 is the scale value 1 is the shifted value
			int diceFace = 1 + randomNumbers.nextInt(6);

			System.out.printf("%d ", diceFace);

			if (counter % 4 ==0) {
				System.out.println();
			}
		}
	}
}
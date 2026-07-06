// Roll a six-sided die 20,000 times.
//this program is a secure Random non deterministic
// shifted and scaled random integer
import java.security.SecureRandom;
public class DiceRoll {
	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();

		//loop 20,000 times
		for (int counter = 1; counter <= 20000; counter = counter + 1) {
			int diceFace = 1 + randomNumbers.nextInt(6);
			System.out.printf("%d ", diceFace);

			if (counter %10 == 0) {
				System.out.println();
			}
		}
	}
}
//this program is a modification of the RollDie program which had 6 seprate counters for each freqeuncy
/*
 * This version replaces the original DiceRollFrequency.java approach,
 * which used six separate counter variables (frequency1...frequency6)
 * and a switch statement to increment the right one.
 *
 * Instead, we use a single array frequency[] of size 7, where
 *   frequency[1] counts 1s, frequency[2] counts 2s, ..., frequency[6] counts 6s.
 * The roll result (1 + randomNumbers.nextInt(6)) directly becomes the array index,
 * allowing a single line to update the correct counter:
 *
 *   ++frequency[1 + randomNumbers.nextInt(6)];
 *
 * This eliminates the need for a switch and makes the code cleaner
 * and easier to extend (e.g., to a 20‑sided die).
 */
import java.security.SecureRandom;
public class RollDiceModified {
	public static void main(String[] args) {
		SecureRandom RandomNumbers = new SecureRandom();
		int [] frequencyArray = new int [7]; //the new counter, instead of multiple frequency counters 

		//calculating the die roll
		for (int roll = 1; roll <= 100; roll++) {
			++frequencyArray[1 + RandomNumbers.nextInt(6)];
		}
		      System.out.printf("%s%10s%n", "Face", "Frequency");

		for (int face = 1; face < frequencyArray.length; face++) {
			System.out.printf("%4d%10d%n", face, frequencyArray[face]);
		}


	}
}
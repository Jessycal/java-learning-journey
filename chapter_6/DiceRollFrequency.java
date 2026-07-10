// Roll a six-sided die 20,000 times. using a for loop counter controlled loop and a switch selection statement
//count and display the frequency with which each number from 1 to 6 appeared
//this program is a secure Random non deterministic
// shifted and scaled random integer

import java.security.SecureRandom;
public class DiceRollFrequency{
	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();

		int frequency1 = 0;
		int frequency2 = 0;
		int frequency3 = 0;
		int frequency4 = 0;
		int frequency5 = 0;
		int frequency6 = 0;

		for ( int roll = 1; roll <= 20000; roll++) {
			int diceFace = 1 + randomNumbers.nextInt(6);

			// use face value 1-6 to determine which counter to increment
			switch (diceFace) {
			case 1:
				++frequency1;
				break;
			case 2:
				++frequency2;
				break;
			case 3:
				++frequency3;
				break;
			case 4:
				++frequency4;
				break;
			case 5:
				++frequency5;
				break;
			case 6:
				++frequency6;
				break;
			}


		}
		System.out.println("Face\tFrequency"); // output headers
        
        System.out.println("1: \t\t" +frequency1);
        System.out.println("2: \t\t" + frequency2);
        System.out.println("3: \t\t" + frequency3);
        System.out.println("4: \t\t" + frequency4);
        System.out.println("5: \t\t" + frequency5);
        System.out.println("6: \t\t" + frequency6);





	}
}
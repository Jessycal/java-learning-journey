// CrapGame.java
// Simulates the dice game craps.
// Rules: roll two dice and sum them.
//   - If the first roll is 7 or 11, the player wins immediately.
//   - If the first roll is 2, 3, or 12, the player loses immediately.
//   - Any other first roll (4, 5, 6, 8, 9, or 10) becomes the player's "point."
//     The player then keeps rolling until either the point is rolled again
//     (a win) or a 7 is rolled before the point (a loss).
// Uses SecureRandom for nondeterministic dice rolls, an enum to track
// game status (CONTINUE, WON, LOST), and a helper method (rollDice)
// to roll both dice and return their sum.

import java.security.SecureRandom;

public class CrapGame {
	//create a class variable(static field ) that let static methods share one object (randomNumber)
	private static final SecureRandom randomNumber = new SecureRandom();

	//declare a special kind of class of enum type that has three constant
	private enum Status {CONTINUE, WON, LOST};

	//constant that represent common rolls of the dice, these are the rolls that trigger immediate win or loss
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	//main method begins
	public static void main(String[] args) {
		
		int myPoint = 0; //total point of roll dice
		Status gameStatus; // status of the game 
		int sumOfDice = rollDice(); //first roll of the dice

		//determine game status and point based on first roll

		switch (sumOfDice) {
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			//myPoint = sumOfDice;
			//System.out.println("You won!!! point is: " + myPoint);
			break;

		case SNAKE_EYES:
		case BOX_CARS:
		case TREY:
			gameStatus = Status.LOST;
			//myPoint = sumOfDice;
			//System.out.println("You lost...sorry try again point is: " + myPoint);
			break;

		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			System.out.println("POINT IS: " + myPoint);
			break;




		}

		//while game is not won or lost, status is continue

		while (gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice(); //roll dice again

			//determine game status

			if (sumOfDice == myPoint) {
				gameStatus = Status.WON;
			}
			else if (sumOfDice == SEVEN) {
				gameStatus = Status.LOST;
			}
		}

		//display messages
	if (gameStatus == Status.WON) {
		System.out.println("You won");
	}
	else {
		System.out.println("You lost");
	}

		

	}

	//roll dice method

	public static int rollDice() {
		int die1 = 1 + randomNumber.nextInt(6);
		int die2 = 1 + randomNumber.nextInt(6);
		int sum = die1 + die2;
		//display the result of the roll
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

		return sum;
	}

	
	
}
import java.security.SecureRandom;
public class DeckOfCards{

private static final SecureRandom randomNumbers = new SecureRandom(); //an instance variable(fields)random number generator
public static final int NUMBER_OF_CARDS = 52; //a constant because the number of decks in a card never changes it is 52

private Card [] deck = new Card[NUMBER_OF_CARDS]; //the link to the Card class, card[] is now an array that holds reference to Card class
private int currentCard = 0; //index of current card from 0-52

//constructor that fills the face and suit
public DeckOfCards() {
	String [] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six","Seven", "Eight", "Nine", "Ten", 
	"Jack", "Queen", "King"};
	String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

	for (int count = 0; count<deck.length; count++) {
		deck[count] = new Card(faces[count % 13], suits[count / 13]);
	}
}

//card shuffle
public void cardShuffle() {
	currentCard = 0;
	for (int first = 0; first < deck.length; first++) {
		//select random number between 0-51
		int secondNumber = first + randomNumbers.nextInt(deck.length - first); //unbiased Fisher-Yates implementation.

		Card temp = deck[first];
		deck[first] = deck[secondNumber];
		deck[secondNumber] = temp;
	}
}

public  Card dealCard() {
	if (currentCard < deck.length) {
		return deck[currentCard++];
	}
	else {
		return null;
}






}
}
//the card class program is a minimal class that serves a very specific and simple purpose:
// to hold the card face and suit to provide a readable String 
//Represents a single playing card with an immutable face and suit.
 //Face values (13 possible):
 //"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
 //Suit values (4 possible):
 //"Hearts", "Diamonds", "Clubs", "Spades"
 //Each card is uniquely defined by the combination of one face and one suit.
//A standard deck of 52 cards is formed by multiplying these possibilities:
//every face paired with every suit → 13 faces × 4 suits = 52 cards.
//The class provides:
//- a constructor to set the card's face and suit (both final)
//- a toString method that returns a readable description (e.g., "Ace of Spades")
 


public class Card {
	//two instance variables that are in encapsulation and are immutable
	private final String face;
	private final String suit;

	//the constructor takes two string argument and assigns them to the fields (instance variables)
	public Card(String cardFace, String cardSuit) {
		this.face = cardFace;
		this.suit = cardSuit;
	}

	//    Overrides the default toString() method inherited from Object.
    //Returns a nice representation like "Ace of Spades" instead of the default hash‑code gibberish.

		public String toString() {
			return face + " of " + suit;
		}

		//getter
		public String getFace() {
			return face;
		}
		public String getSuit() {
			return suit;
		}
	}
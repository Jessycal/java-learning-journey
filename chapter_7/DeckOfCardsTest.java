public class DeckOfCardsTest {
	public static void main(String[] args) {
		DeckOfCards myNewDeckOfCards = new DeckOfCards();
		myNewDeckOfCards.cardShuffle();

		//print all cards in the other in which they were dealt with
		for (int i = 1; i <=myNewDeckOfCards.NUMBER_OF_CARDS; i++) {
			System.out.println(myNewDeckOfCards.dealCard());
			if (i % 5 ==0) {
				System.out.println("*****************************");
				System.out.println();
			}
		}
	}
}
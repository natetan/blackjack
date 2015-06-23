
public class Card {
	private Deck deck;
	private int value;
	private Suit suit;
	private String display;
	
	public Card() {
		this.deck = new Deck();
		this.display = "";	
	}
	
	// This method is supposed to be used to get me the value of the card,
	// which each number as its own respective value, but converting the face
	// cards is a tad bit difficult...
	public int getValue() {
		String faceValue = this.deck.getFaceValue();
		int value = this.deck.getValue();
		if (faceValue.equals("Ace")) {
			return 1;
		} else if (faceValue.equals("Jack") || faceValue.equals("Queen") ||
				faceValue.equals("King")) {
			return 10;
		} else {
			return value;
		}
	}
	
	public Suit getSuit() {
		return this.deck.getSuit();
	}
	
	public String getCard() {
		this.value = this.deck.getValue();
		this.suit = this.getSuit();
		return this.value + " of " + this.suit;
	}
}

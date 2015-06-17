
public class Card {
	private Deck deck;
	private String value;
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
		String value = this.deck.getValue();
		this.display = value;
		if (value.equals("Jack") || value.equals("Queen") || value.equals("King")) {
			return 10;
		} else if (value.equals("Ace")) {
			return 1;
		} else {
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

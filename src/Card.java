
public class Card {
	private Suit suit;
	private int number;
	
	public Card(Suit suit, int number) {
		this.suit = suit;
		this.number = number;
	}
	
	public int getValue() {
		return this.number;
	}
	
	public String getCard() {
		return number + " of " + suit;
	}
}

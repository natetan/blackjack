import java.util.ArrayList;
import java.util.List;

public class Card {
	private Deck deck;
	private String value;
	private Suit suit;
	private List<String> cards;
	
	public Card() {
		this.deck = new Deck();
		this.cards = new ArrayList<String>();
	}
	
	public Suit getSuit() {
		return this.deck.getSuit();
	}
	
	public String getCard() {
		this.suit = this.getSuit();
		this.value = this.deck.getValue();
		this.cards.add(this.value);
		return this.value + " of " + this.suit;
	}
	
	public int getSum() {
		int sum = 0;
		for (int i = 0; i < this.cards.size(); i++) {
			sum += this.convertToInt(this.cards.get(i));
		}
		return sum;
	}
	
	public int convertToInt(String value) {
		if (value.equals("Ace")) {
			return this.checkAce();
		} else if (value.equals("2")) {
			return 2;
		} else if (value.equals("3")) {
			return 3;
		} else if (value.equals("4")) {
			return 4;
		} else if (value.equals("5")) {
			return 5;
		} else if (value.equals("6")) {
			return 6;
		} else if (value.equals("7")) {
			return 7;
		} else if (value.equals("8")) {
			return 8;
		} else if (value.equals("9")) {
			return 9;
		} else {
			return 10;
		}
	}
	
	public boolean blackJack() {
		return this.getSum() == 21;
	}
	
	public boolean isGameOver() {
		return this.getSum() > 21;
	}
	
	public int checkAce() {
		if (11 + this.getSum() > 21) {
			return 1;
		} else {
			return 11;
		}
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	private String[] values = {
		"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
		"Jack", "Queen", "King"
	};
	
	private Random r;
	private List<String> cards;
	
	public Deck() {
		this.r = new Random();
		this.cards = new ArrayList<String>();
		this.transfer(this.values, this.cards);
	}
	
	public Suit getSuit() {
		List<Suit> suits = new ArrayList<Suit>();
		suits.add(Suit.Hearts);
		suits.add(Suit.Diamonds);
		suits.add(Suit.Clubs);
		suits.add(Suit.Spades);
		return suits.get(this.r.nextInt(suits.size()));
	}
	
	public int getIntValue() {
		String value = this.cards.get(this.r.nextInt(this.cards.size()));
		if (value.equals("Ace")) {
			return 1;
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
	
	public String getValue() {
		return this.cards.get(this.r.nextInt(this.cards.size()));
	}
	
	private void transfer(String[] items, List<String> list) {
		for (String item : items) {
			list.add(item);
		}
	}
}

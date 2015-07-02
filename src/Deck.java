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
	
	public String getValue() {
		return this.cards.get(this.r.nextInt(this.cards.size()));
	}
	
	private void transfer(String[] items, List<String> list) {
		for (String item : items) {
			list.add(item);
		}
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class Deck {
	public String[] cards = {
			"2", "3", "4", "5", "6", "7", "8", "9", "10",
			"Ace", "Jack", "Queen", "King"
	};
	
	private Random r;
	
	public Deck() {
		List<String> list = new ArrayList<String>();
		this.r = new Random();
		for (String card : this.cards) {
			list.add(card);
		}
		// Map 4 lists of cards to each suit...
		// Not sure if I'm doing this correctly...
		// Feels like I'm overriding it every single time
		Map<List<String>, Suit> suits = new HashMap<List<String>, Suit>();
		suits.put(list, Suit.Hearts);
		suits.put(list, Suit.Diamonds);
		suits.put(list, Suit.Clubs);
		suits.put(list, Suit.Spades);
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
		return this.cards[r.nextInt(this.cards.length)];
	}
}

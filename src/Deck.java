import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Deck {
	public String[] cards = {
			"2", "3", "4", "5", "6", "7", "8", "9", "10",
			"A", "J", "Q", "K"
	};
	
	public Deck() {
		List<String> list = new ArrayList<String>();
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
}

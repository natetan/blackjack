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
		Map<Integer, Suit> m = new HashMap<Integer, Suit>();
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	public int[] cards = {
			2, 3, 4, 5, 6, 7, 8, 9, 10,
	};
	public String[] faceCards = {
			"Ace", "Jack", "Queen", "King"
	};
	
	private Random r;
	
	public Deck() {
		this.r = new Random();
	}
	
	public Suit getSuit() {
		List<Suit> suits = new ArrayList<Suit>();
		suits.add(Suit.Hearts);
		suits.add(Suit.Diamonds);
		suits.add(Suit.Clubs);
		suits.add(Suit.Spades);
		return suits.get(this.r.nextInt(suits.size()));
	}
	
	public int getValue() {
		return this.cards[this.r.nextInt(this.cards.length)];
	}
	
	public String getFaceValue() {
		return this.faceCards[this.r.nextInt(this.faceCards.length)];
	}
}

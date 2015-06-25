
public class Hand {
	private int cards;
	
	public Hand() {
		this.cards = 2;
		Card card = new Card();
	}
	
	public String currentHand(Card card) {
		String hand = "";
		for (int i = 0; i < this.cards; i++) {
			hand += "Card " + (i + 1) + ": " + card.getCard() + "\n";
		}
		return hand;
	}
	
	public void hit() {
		
	}
	
	public void place() {
		
	}
	
	public void fold() {
		
	}
}

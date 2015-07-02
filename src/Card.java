import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Card {
	private Deck deck;
	private String value;
	private Suit suit;
	private List<String> cards;
	
	public static final int STARTING_CARDS = 2;
	
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
	
	private int checkAce() {
		if (11 + this.getSum() > 21) {
			return 1;
		} else {
			return 11;
		}
	}
	
	public int getPcSum() {
		Random r = new Random();
		int number = r.nextInt(4);
		if (number == 0) {
			return 18;
		} else if (number == 1) {
			return 19;
		} else if (number == 2) {
			return 20;
		} else {
			return 21;
		}
	}
	
	public String showHand(Card card) {
		String hand = "";
		for (int i = 0; i < STARTING_CARDS; i++) {
			hand += "Card " + (i + 1) + ": " + this.getCard() + "\n";
		}
		return hand;
	}
	
	public void hit() {
		System.out.println("Next card: " + this.getCard());
		System.out.println("Current Sum : " + this.getSum());
		System.out.println();
	}
	
	public void place() {
		int sum = this.getSum();
		int pcSum = this.getPcSum();
		System.out.println("Your sum: " + sum);
		System.out.println("Computer sum: " + pcSum);
		if (sum > pcSum) {
			System.out.println("Congrats! You beat the computer!");
		} else if (sum < pcSum) {
			System.out.println("You suck! You lost to artificial intelligence!");
		} else { // they're equal
			System.out.println("It was a tie!");
		}
	}
	
	public void fold() {
		System.out.print("Wow...you really didn't think you could win? The computer's sum ");
		System.out.println("was " + (this.getSum() - 1));
		System.out.println("You're a sore loser! Better luck next time!");
	}
	
	public void checkChoice(int choice) {
		if (choice != 1 || choice != 2 || choice != 3) {
			throw new IllegalArgumentException("That's not a valid choice!");
		}
	}
}

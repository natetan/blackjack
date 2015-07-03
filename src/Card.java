/*
 * Yulong Tan
 * July 2nd, 2015
 * 
 * The Card class represents a Bicycle playing card
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Card {
	private Deck deck;
	private String value;
	private List<String> cards;
	
	public static final int STARTING_CARDS = 2;
	
	// Initializes a Deck and a list of cards
	public Card() {
		this.deck = new Deck(); 
		this.cards = new ArrayList<String>();
	}
	
	// Returns the suit of the card
	public Suit getSuit() {
		return this.deck.getSuit();
	}
	
	// Returns a String representation of the card's suit and its value
	public String getCard() {
		Suit suit = this.getSuit();
		this.value = this.deck.getValue();
		this.cards.add(this.value);
		return this.value + " of " + suit;
	}
	
	// Returns the sum of all the cards
	public int getSum() {
		int sum = 0;
		for (int i = 0; i < this.cards.size(); i++) {
			sum += this.convertToInt(this.cards.get(i));
		}
		return sum;
	}
	
	// This method takes a String as a parameter and converts it to an
	// Integer representation of the card
	private int convertToInt(String value) {
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
	
	// This method returns true if the user has the sum of 21
	// and flase otherwise
	public boolean blackJack() {
		return this.getSum() == 21;
	}
	
	// Returns true if the sum is over 21 and false otherwise
	public boolean isGameOver(int sum) {
		return sum > 21;
	}
	
	// This method determines whether the ace is 1 or 11. If 11 + the current
	// sum is over 21, it returns a 1 and an 11 otherwise.
	private int checkAce() {
		if (11 + this.getSum() > 21) {
			return 1;
		} else {
			return 11;
		}
	}
	
	// Returns the computer's sum
	public int getPcSum() {
		Random r = new Random();
		int[] nums = {16, 17, 18, 19, 20, 21};
		return nums[r.nextInt(nums.length)];
	}
	
	// Returns a String representation of the user's current hand
	public String showHand() {
		String hand = "";
		for (int i = 0; i < STARTING_CARDS; i++) {
			hand += "Card " + (i + 1) + ": " + this.getCard() + "\n";
		}
		return hand;
	}
	
	// This method gives another card to the user
	public void hit() {
		System.out.println("Next card: " + this.getCard());
		System.out.println("Current Sum : " + this.getSum());
		System.out.println();
	}
	
	// This method places the cards on the table
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
	
	// This method does the folding, where the user essentially gives up
	public void fold() {
		System.out.print("Wow...you really didn't think you could win? The computer's sum ");
		System.out.println("was " + (this.getSum() - 1));
		System.out.println("You're a sore loser! Better luck next time!");
	}
}

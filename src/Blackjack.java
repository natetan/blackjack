/*
 * Yulong Tan
 * July 2nd, 2015
 * 
 * This plays a game of Blackjack with the user
 */

import java.util.Scanner;

public class Blackjack {
	public static final int SUM = 21;
	
	// Main method that initializes a game with the user
	public static void main(String[] arguments) {
		Card card = new Card();
		Scanner console = new Scanner(System.in);
		giveIntro();
		initiate(card);
		play(console, card);
	}
	
	// Gives an introduction of the game to the user
	public static void giveIntro() {
		System.out.println("Welcome to my game of BlackJack. If you don't");
		System.out.println("already know what game that is, then you're clearly");
		System.out.println("out of luck. You're playing with the PC to see who");
		System.out.println("gets to " + SUM + " first.");
		System.out.println();
	}
	
	// Initializes the game by giving the user their 2 starting cards
	public static void initiate(Card card) {
		System.out.println("Here are your first 2 cards!");
		System.out.println();
		System.out.println(card.showHand());
		System.out.println("Current Sum: " + card.getSum());
		System.out.println();
	}
	
	// This method does the direct playing with the user, allowing them to hit, place, or fold
	public static void play(Scanner console, Card card) {
		String option1 = "1) Hit";
		String option2 = "2) Place Cards";
		String option3 = "3) Fold";
		boolean place = true;
		while (!card.isGameOver(card.getSum()) && !card.blackJack() && place) {
			System.out.println("What would you like to do?");
			System.out.printf("\t%s\n\t%s\n\t%s\n", option1, option2, option3);
			int choice = console.nextInt();
			if (choice == 1) {
				card.hit();
			} else if (choice == 2) {
				place = false;
				card.place();
			} else { 
				place = false;
				card.fold();
			}
			if (card.isGameOver(card.getSum())) {
				System.out.println("Busted! You lost the game!");
			}
			if (card.blackJack()) {
				System.out.println("BlackJack! You won!");
			}
		}
	}
}

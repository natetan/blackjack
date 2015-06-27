import java.util.Scanner;

public class BlackjackMain {
	public static final int SUM = 21;

	public static void main(String[] arguments) {
		Card card = new Card();
		Hand hand = new Hand();
		Scanner console = new Scanner(System.in);
		giveIntro();
		initiate(hand, card);
		play(console, hand, card);
	}

	public static void giveIntro() {
		System.out.println("Welcome to my game of BlackJack. If you don't");
		System.out.println("already know what game that is, then you're clearly");
		System.out.println("out of luck. You're playing with the PC to see who");
		System.out.println("gets to " + SUM + " first.");
		System.out.println();
	}

	public static void initiate(Hand hand, Card card) {
		System.out.println("Here are your first 2 cards!");
		System.out.println();
		System.out.println(hand.currentHand(card));
		System.out.println("Current Sum: " + card.getSum());
		System.out.println();
	}

	public static void play(Scanner console, Hand hand, Card card) {
		String option1 = "1) Hit";
		String option2 = "2) Place Cards";
		String option3 = "3) Fold";
		while (!card.isGameOver() && !card.blackJack()) {
			System.out.println("What would you like to do?");
			System.out.printf("\t%s\n\t%s\n\t%s\n", option1, option2, option3);
			int choice = console.nextInt();
			if (choice == 1) {
				System.out.println("Next card: " + card.getCard());
				System.out.println("Current Sum : " + card.getSum());
				System.out.println();
			} else if (choice == 2) {
				// Stop playing and compare sums (so implement a compareTo method?) to see who wins
			} else { // choice == 3 
				// Quit the program
				// Give them a fairly nice goodbye message
				// Ask them if they wanna play again 
			}
			if (card.isGameOver()) {
				System.out.println("Busted! You lost the game!");
			}
			if (card.blackJack()) {
				System.out.println("BlackJack! You won!");
			}
		}
	}
}

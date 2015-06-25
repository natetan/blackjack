import java.util.Scanner;

public class BlackjackMain {
	public static final int SUM = 21;
	
	public static void main(String[] arguments) {
		Card card = new Card();
		Hand hand = new Hand();
		Scanner console = new Scanner(System.in);
		giveIntro();
		initiate(hand, card);
		play(console);
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
	
	public static void play(Scanner console) {
		System.out.println("What would you like to do?");
		String option1 = "1) Hit";
		String option2 = "2) Place Cards";
		String option3 = "3) Fold";
		System.out.printf("\t%s\n\t%s\n\t%s\n", option1, option2, option3);
		int choice = console.nextInt();
		if (choice == 1) {
			// Add a card to the hand, and add the sum as well. 
		} else if (choice == 2) {
			// Stop playing and compare sums (so implement a compareTo method?) to see who wins
		} else { // choice == 3 
			// Quit the program
			// Give them a fairly nice goodbye message
			// Ask them if they wanna play again 
		}
	}
}

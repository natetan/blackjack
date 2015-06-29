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
		boolean place = true;
		while (!card.isGameOver() && !card.blackJack() && place) {
			System.out.println("What would you like to do?");
			System.out.printf("\t%s\n\t%s\n\t%s\n", option1, option2, option3);
			int choice = console.nextInt();
			if (choice == 1) {
				System.out.println("Next card: " + card.getCard());
				System.out.println("Current Sum : " + card.getSum());
				System.out.println();
			} else if (choice == 2) {
				place = false;
				int sum = card.getSum();
				int pcSum = card.getPcSum();
				System.out.println("Your sum: " + sum);
				System.out.println("Computer sum: " + pcSum);
				if (sum > pcSum) {
					System.out.println("Congrats! You beat the computer!");
				} else if (sum < pcSum) {
					System.out.println("You suck! You lost to artificial intelligence!");
				} else { // they're equal
					System.out.println("It was a tie!");
				}
			} else { // fold
				place = false;
				System.out.print("Wow...you really didn't think you could win? The computer's sum ");
				System.out.println("was " + (card.getSum() - 1));
				System.out.println("You're a sore loser! Better luck next time!");
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

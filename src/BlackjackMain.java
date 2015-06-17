import java.util.Scanner;

public class BlackjackMain {
	public static final int SUM = 21;
	
	public static void main(String[] args) {
		Card card = new Card();
		Scanner console = new Scanner(System.in);
		giveIntro();
		initiate(card);
		play(console);
	}
	
	public static void giveIntro() {
		System.out.println("Welcome to my game of BlackJack. If you don't");
		System.out.println("already know what game that is, then you're clearly");
		System.out.println("out of luck. You're playing with the PC to see who");
		System.out.println("gets to " + SUM + "first.");
		System.out.println();
	}
	
	public static void initiate(Card card) {
		System.out.println("Here are your first 2 cards!");
		System.out.println();
		// Maybe create a Hand class that has a function which
		// displays the current cards?
		System.out.println("First Card:\t" + card.getCard());
		System.out.println("Second Card:\t" + card.getCard());
		System.out.println("Current Sum:\t"); // Card.getSum or make a Hand class?
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
			
		} else if (choice == 2) {
			
		} else { // choice == 3 
			
		}
	}
}

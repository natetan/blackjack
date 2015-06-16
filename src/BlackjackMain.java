
public class BlackjackMain {
	public static final int SUM = 21;
	
	public static void main(String[] args) {
		giveIntro();
		initiate();
		play();
	}
	
	public static void giveIntro() {
		System.out.println("Welcome to my game of BlackJack. If you don't");
		System.out.println("already know what game that is, then you're clearly");
		System.out.println("out of luck. You're playing with the PC to see who");
		System.out.println("gets to " + SUM + "first.");
		System.out.println();
	}
	
	public static void initiate() {
		System.out.println("Here are your first 2 cards!");
		System.out.println();
	}
	
	public static void play() {
		System.out.println("What would you like to do?");
		String option1 = "1) Hit";
		String option2 = "2) Place Cards";
		String option3 = "3) Fold";
	}
}

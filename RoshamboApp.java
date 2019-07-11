import java.util.Scanner;

public class RoshamboApp {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.nextLine();
		ConsolePlayer player = new ConsolePlayer(name);
		RockPlayer bill = new RockPlayer("Bill");
		RandomPlayer bob = new RandomPlayer("Bob");
		char answer = 'y';
		int wins = 0;
		int losses = 0;
		int ties = 0;

		do {

			System.out.println("Would you like to play against Bill or Bob?");
			char choice = scan.next().charAt(1);

			if (choice == 'i') {

				Roshambo a = player.generateRoshambo();
				Roshambo b = bill.generateRoshambo();
				System.out.println(name + ": " + a.toString());
				System.out.println("Bill: " + b.toString());

				if (a == b) {

					System.out.println("It's a tie!");
					ties += 1;

				} else if ((a == Roshambo.rock && b == Roshambo.scissors)
						|| (a == Roshambo.scissors && b == Roshambo.paper)
						|| (a == Roshambo.paper && b == Roshambo.rock)) {

					System.out.println(name + " wins!");
					wins += 1;

				} else {

					System.out.println("Bill wins!");
					losses += 1;

				}
				
			} else {

				Roshambo a = player.generateRoshambo();
				Roshambo b = bob.generateRoshambo();
				System.out.println(name + ": " + a.toString());
				System.out.println("Bob: " + b.toString());

				if (a == b) {

					System.out.println("It's a tie!");
					ties += 1;

				} else if ((a == Roshambo.rock && b == Roshambo.scissors)
						|| (a == Roshambo.scissors && b == Roshambo.paper)
						|| (a == Roshambo.paper && b == Roshambo.rock)) {

					System.out.println(name + " wins!");
					wins += 1;

				} else {

					System.out.println("Bob wins!");
					losses += 1;

				}
			}
			
			System.out.println("You Won: " + wins);
			System.out.println("You Lost: " + losses);
			System.out.println("You Tied: " + ties);
			
			System.out.println("Would you like to play again? (y/n)");
			answer = scan.next().charAt(0);
			
		} while (answer == 'y' || answer == 'Y');

		scan.close();

	}
}

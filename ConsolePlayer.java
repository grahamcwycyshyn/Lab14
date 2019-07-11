import java.util.Scanner;

public class ConsolePlayer extends Player {

	public ConsolePlayer() {
		super();
	}

	public ConsolePlayer(String name) {
		super(name);
	}

	Scanner scan = new Scanner(System.in);

	public Roshambo generateRoshambo() {

		System.out.println("Rock, Paper or Scissors? (r/p/s)");

		char roshambo = 0;
		
		roshambo = scan.next().charAt(0);

		if (roshambo == 'r') {
			return Roshambo.rock;
		} else if (roshambo == 'p') {
			return Roshambo.paper;
		} else {
			return Roshambo.scissors;
		}
	}
}

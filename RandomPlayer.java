public class RandomPlayer extends Player {

	public RandomPlayer() {
		super();
	}

	public RandomPlayer(String name) {
		super(name);
	}

	public Roshambo generateRoshambo() {
		int a = (int) (Math.random() * 3);
		if (a == 0) {
			return Roshambo.rock;
		} else if (a == 1) {
			return Roshambo.paper;
		} else {
			return Roshambo.scissors;
		}

	}
}

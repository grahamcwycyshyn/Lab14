public class RockPlayer extends Player{
	
	public RockPlayer() {
		super();
	}
	
	public RockPlayer(String name) {
		super(name);
	}

	public Roshambo generateRoshambo() {
		return Roshambo.rock;
	}

}

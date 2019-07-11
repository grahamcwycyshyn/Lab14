public abstract class Player {
	
	protected String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Player() {
		super();
	}
	
	public Player(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRoshambo();
	
}

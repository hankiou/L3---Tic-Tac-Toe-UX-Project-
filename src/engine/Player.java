package engine;

public abstract class Player {
	
	int side; // -1 or 1
	
	public Player(int side) {
		this.side = side;
	}

	public Coordinate play() {
		return new Coordinate(0, 0);
	};
	
	
}

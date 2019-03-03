package engine;

import AI.Algorithm;

public class Player_ai extends Player{
	
	Algorithm algo; // See later

	public Player_ai(int side, AI.Algorithm algorithm) {
		super(side);
		this.algo = algorithm;
	}

	
	public Coordinate play(){
		return algo.play();
	}
}

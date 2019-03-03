package AI;

import java.util.Random;

import engine.Coordinate;

public class RandomChoice implements Algorithm {

	@Override
	public Coordinate play() {

		Random r = new Random();
		return new Coordinate(r.nextInt(3), r.nextInt(3));
	}

}

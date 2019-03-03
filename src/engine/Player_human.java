package engine;

import java.util.Scanner;

public class Player_human extends Player {

	public Player_human(int side) {
		super(side);
	}

	public Coordinate play() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int line, col;
		do {
			System.out.println("Enter line (0 - 2): ");
			line = scanner.nextInt();
			System.out.println("Enter column (0 - 2): ");
			col = scanner.nextInt();
		} while(line < 0 || line > 2 || col < 0 || col > 2);
		return new Coordinate(line, col);
	}

}

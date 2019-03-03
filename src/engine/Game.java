package engine;

public class Game {

	private Player players[];
	private Board board;
	
	public Game(Config cfg) {
		board = new Board();
		players = new Player[2];
		players[0] = new Player_human(1);
		
		if(cfg.isAgainstAI()) players[1] = new Player_ai(-1);
		else players[1] = new Player_human(-1);
	}
	
	public void run() {
		int currentPlayer = 0;
		
		while(board.winner() == 0) {
			board.displayInConsole();
			System.out.println("Player " + strForValue(players[currentPlayer].side) + "'s turn");
			// Turn //
			Coordinate choice;
			do {
				choice = players[currentPlayer].play();
			} while(!board.moveIsValid(choice));
			
			board.setValueAt(players[currentPlayer].side, choice.line, choice.col);
			currentPlayer = switchPlayer(currentPlayer);
		}

		board.displayInConsole();
		System.out.println(strForValue(board.winner()) + " WINS !");
		
	}
	
	private int switchPlayer(int currentPlayer) {
		if(currentPlayer == 0) return 1;
		else return 0;
	}
	
	public static String strForValue(int x) {
		if(x == -1) return "X";
		else if(x == 1) return "O";
		return " ";
	}
}

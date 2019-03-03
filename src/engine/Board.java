package engine;

public class Board {
	
	private int[][] matrix = {	
								{0, 0, 0},
								{0, 0, 0},
								{0, 0, 0}
							 };
	
	Board(){
	}
	
	public int getValueAt(int line, int col) {
		
		if(line < 3 && col < 3 && line > -1 && col > -1) return matrix[line][col];
		return -2;
	}
	
	public void setValueAt(int x, int line, int col) {
		if(line < 3 && col < 3 && line > -1 && col > -1) 
			matrix[line][col] = x;
	}
	
	public boolean moveIsValid(Coordinate c) {
		if(matrix[c.line][c.col] != 0) return false;
		return true;
	}
	
	public void displayInConsole() {
		System.out.println("Board:");
		for(int i = 0; i < 3; i++) {
			String line = "|";
			for(int j = 0; j < 3; j++) {
				line += Game.strForValue(matrix[i][j]);
				line += "|";
			}
			System.out.println(line);
		}
	}
	
	public int winner() {
		int wDiag1 = 0;
		int wDiag2 = 0;
		for(int i = 0; i < 3; i++) {
			int wLine = 0;
			int wCol = 0;
			// Lines / Col
			for(int j = 0; j < 3; j++) {
				wLine += matrix[i][j];
				wCol += matrix[j][i];
			}
			
			// Diagonals
			wDiag1 += matrix[i][i];
			wDiag2 += matrix[i][2-i];
			
			
			if(Math.abs(wLine) == 3) return wLine / 3;
			if(Math.abs(wCol) == 3) return wCol / 3;
		}

		if(Math.abs(wDiag1) == 3) return wDiag1 / 3;
		if(Math.abs(wDiag2) == 3) return wDiag2 / 3;
		
		return 0;
	}
}

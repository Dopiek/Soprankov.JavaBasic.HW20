public class CreatingBoard {
	private int x = 5 + 2;
	private int y = 10 + 2;

	private int[][] board = new int[x][y];

	public int[][] generationValue() {
		for (int i = 1; i < board.length - 1; i++) {
			for (int j = 1; j < board[i].length - 1; j++) {
				board[i][j] = (int) (Math.random() * 2);
			}
		}
		return board;
	}

	public int getValueX() {
		return x;
	}

	public int getValueY() {
		return y;
	}
}

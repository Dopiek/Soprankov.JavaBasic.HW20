public class NextIteration {
	CreatingBoard creatinBoard = new CreatingBoard();

	public int[][] nextIteration(int[][] board) {
		int[][] reBoard = new int[creatinBoard.getValueX()][creatinBoard.getValueY()];

		for (int i = 1; i < board.length - 1; i++) {
			for (int j = 1; j < board[i].length - 1; j++) {

				int value = board[i - 1][j - 1] + board[i - 1][j] + board[i - 1][j + 1] + board[i][j - 1]
						+ board[i][j + 1] + board[i + 1][j - 1] + board[i + 1][j] + board[i + 1][j + 1];

				switch (board[i][j]) {
				case 1 -> {
					if (value > 3 || value < 2)
						reBoard[i][j] = 0;
					else
						reBoard[i][j] = 1;
				}
				case 0 -> {
					if (value == 3)
						reBoard[i][j] = 1;
					else
						reBoard[i][j] = 0;
				}
				}
			}
		}
		return reBoard;
	}

	public int findNumberLiving(int[][] board) {
		int counter = 0;

		for (int i = 1; i < board.length - 1; i++) {
			for (int j = 1; j < board[i].length - 1; j++) {
				if (board[i][j] > 0)
					counter++;
			}
		}
		return counter;
	}
}

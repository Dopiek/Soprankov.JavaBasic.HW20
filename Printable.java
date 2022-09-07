public class Printable {

	public int printableBoard(int[][] board) {
		int counter = 0;

		for (int i = 1; i < board.length - 1; i++) {
			for (int j = 1; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		return counter;
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class MainGameLife {
	public static void main(String[] args) {
		CreatingBoard creatingBoard = new CreatingBoard();
		NextIteration nextIteration = new NextIteration();
		Printable printable = new Printable();
		Scanner scanner = new Scanner(System.in);

		int[][] board = creatingBoard.generationValue();
		int counter = 0;

		printable.printableBoard(board);

		do {
			counter = 0;
			scanner.nextLine();
			int[][] tempBoard = nextIteration.nextIteration(board);
			board = Arrays.copyOf(tempBoard, tempBoard.length);
			printable.printableBoard(tempBoard);
			counter = nextIteration.findNumberLiving(board);
		} while (counter > 0);
	}
}
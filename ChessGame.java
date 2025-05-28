import java.util.*;

public class ChessGame {
    public static void main(String[] args) {
	Board mainBoard = new Board();
		ChessGame game = new ChessGame();
		System.out.println(mainBoard);
		
		
		mainBoard.move('a', 1, 'a', 3);
		
		System.out.println(mainBoard);
    }
}
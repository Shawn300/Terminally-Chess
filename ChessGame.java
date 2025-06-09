import java.util.*;
import java.util.Scanner;

public class ChessGame {
    private boolean p1turn;
    private boolean gameStart = true;
    private boolean p2turn;
    
    public ChessGame() {
        Scanner keyboard = new Scanner(System.in);
        Board mainBoard = new Board();
        
        while (gameStart) {
            System.out.println(mainBoard);
            p1turn = true;
            if (p1turn) {
                System.out.println("Player 1: Enter your move (format: a 2 b 3):");

                char char1 = keyboard.next().charAt(0);
                int num1 = keyboard.nextInt();
                char char2 = keyboard.next().charAt(0);
                int num2 = keyboard.nextInt();
                
                if (mainBoard.isMoveValid(char1, num1, char2, num2)) {
                   mainBoard.move(char1, num1, char2, num2);
                }

                System.out.println("Board after move:");
                System.out.println(mainBoard);

                p1turn = false;
                p2turn = true;
            }
            if (p2turn) {
                System.out.println("Player 2: Enter your move (format: a 2 b 3):");

                char char1 = keyboard.next().charAt(0);
                int num1 = keyboard.nextInt();
                char char2 = keyboard.next().charAt(0);
                int num2 = keyboard.nextInt();

                if (mainBoard.isMoveValid(char1, num1, char2, num2)) {
                   mainBoard.move(char1, num1, char2, num2);
                }
                
                System.out.println("Board after move:");
                System.out.println(mainBoard);

                p1turn = false;
                p2turn = true;
            }
        }
    }
    public static void main(String[] args) {
	    ChessGame game = new ChessGame();
    }
}

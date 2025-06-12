import java.util.*;
import java.util.Scanner;
import java.util.Stack;

public class Board {
   Piece[][] board;
   private Stack<Piece> captureStack = new Stack<>();

    public Board() {
        initializeBoard();
    }

    private void initializeBoard() {
        board = new Piece[][]{
            {new Rook("black"), new Knight("black"), new Bishop("black"), new Queen("black"), new King("black"), new Bishop("black"), new Knight("black"), new Rook("black")},
            {new Pawn("black"), new Pawn("black"), new Pawn("black"), new Pawn("black"), new Pawn("black"), new Pawn("black"), new Pawn("black"), new Pawn("black")},
            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null},
            {new Pawn("white"), new Pawn("white"), new Pawn("white"), new Pawn("white"), new Pawn("white"), new Pawn("white"), new Pawn("white"), new Pawn("white")},
            {new Rook("white"), new Knight("white"), new Bishop("white"), new Queen("white"), new King("white"), new Bishop("white"), new Knight("white"), new Rook("white")}
        };
    }
	
	public boolean move(char xStartChar, int yStart, char xEndChar, int yEnd) {
		int xStart = xStartChar - 'a';
        int xEnd = xEndChar - 'a';
		yStart = 8 - yStart;
		yEnd = 8 - yEnd;
		if (board[yEnd][xEnd] instanceof Piece) {
		    addCapture(board[yEnd][xEnd]);
		}
        board[yEnd][xEnd] = board[yStart][xStart];
        board[yStart][xStart] = null;
        return true;
    }
    
    public void addCapture(Piece p) {
        captureStack.push(p);
    }
    
    public void printCaptures() {
        if (captureStack.isEmpty()) {
            System.out.println("No captures");
            return;
        }
        
        System.out.print("Captures: ");
        Stack<Piece> temp = new Stack<>();
        
        while(!captureStack.isEmpty()) {
            Piece p = captureStack.pop();
            System.out.print(p + " ");
            temp.push(p);
        }
        
        System.out.println();
        
        //restore original stack
        while (!temp.isEmpty()) {
            captureStack.push(temp.pop());
        }
    }
    
    public boolean isMoveValid(char xStartChar, int yStart, char xEndChar, int yEnd) {
        int xStart = xStartChar - 'a';
        int xEnd = xEndChar - 'a';
		yStart = 8 - yStart;
		yEnd = 8 - yEnd;
		Piece obj = board[yStart][xStart];
		char bound1 = '`';
		char bound2 = 'i';
	    if (xStartChar > bound1 && xEndChar < bound2 && yStart >= 1 && yStart <= 8) {
            if (obj.isValidPath(xStart, yStart, xEnd, yEnd)) {
				return true;
			} else {
                System.out.println("Invalid path");
                return false;
            }
        }
        System.out.println("Move out of bounds");
        return false;
    }

	public String toString() {
        StringBuilder result = new StringBuilder();
        
        // Add column labels at top
        result.append("    a   b   c   d   e   f   g   h\n");
        
        // Add top border
        result.append("  +---+---+---+---+---+---+---+---+\n");
        
        // Iterate through rows (8 to 1 for proper chess notation)
        for (int row = 0; row < 8; row++) {
            // Add row number and left border
            result.append((8 - row) + " |");
            
            // Add pieces for this row
            for (int col = 0; col < 8; col++) {
                String piece;
                if (board[row][col] == null) {
                    piece = " "; // Empty space for empty squares
                } else {
                    piece = board[row][col].toString();
                }
                
                // Center the piece in the cell with padding
                result.append(" " + piece + " ");
                
                // Add vertical separator
                result.append("|");
            }
            
            // Add row number at the end
            result.append(" " + (8 - row) + "\n");
            
            // Add horizontal separator (except for last row)
            if (row < 7) {
                result.append("  +---+---+---+---+---+---+---+---+\n");
            }
        }
        
        // Add bottom border
        result.append("  +---+---+---+---+---+---+---+---+\n");
        
        // Add column labels at bottom
        result.append("    a   b   c   d   e   f   g   h");
        
        return result.toString();
    }
}


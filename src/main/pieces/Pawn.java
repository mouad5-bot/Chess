package main.pieces;

import main.model.ChessBoard;
import main.model.ChessPiece;
import main.model.Color;
import main.model.Square;

public class Pawn extends ChessPiece {

    public Pawn(Square position, ChessBoard board, Color color) {
        super(position, board, color);
    }



    private static final int BOARD_SIZE = 8;

    private static boolean isValidMove(int currentRow, int currentCol, int newRow, int newCol, boolean isWhitePlayer) {

        if (newRow < 0 || newRow >= BOARD_SIZE || newCol < 0 || newCol >= BOARD_SIZE) {
            return false;
        }

        // Calculate the row movement direction based on the player's color
        int rowDirection = isWhitePlayer ? -1 : 1;

        // Check if the pawn is moving forward by one row
        if (newRow == currentRow + rowDirection && newCol == currentCol) {
            return true;
        }

        // Check if the pawn is making its initial two-square move
        if (newRow == currentRow + (2 * rowDirection) && newCol == currentCol && currentRow == (isWhitePlayer ? 6 : 1)) {
            return true;
        }

        // Check if the pawn is capturing a piece diagonally
        if (newRow == currentRow + rowDirection && Math.abs(newCol - currentCol) == 1) {
            return true;
        }

        return false;
    }

//    public static void main(String[] args) {
//        // Example usage
//        int currentRow = 1;
//        int currentCol = 3;
//        int newRow = 2;
//        int newCol = 3;
//        boolean isWhitePlayer = true;
//
//        if (isValidMove(currentRow, currentCol, newRow, newCol, isWhitePlayer)) {
//            // Perform the move
//            System.out.println("Valid move!");
//        } else {
//            System.out.println("Invalid move!");
//        }
//    }
}

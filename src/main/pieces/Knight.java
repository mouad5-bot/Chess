package main.pieces;

import main.model.ChessBoard;
import main.model.ChessPiece;
import main.model.Color;
import main.model.Square;

public class Knight extends ChessPiece {
        public Knight(Square position, ChessBoard board, Color color) {
            super(position, board, color);
        }

        public boolean isValideMove(int currentRow, int currentCol, int newRow, int newCol) {
            // Check if the move is a valid knight move | abs calcul the absolut value of number
            int rowDiff = Math.abs(newRow - currentRow);
            int colDiff = Math.abs(newCol - currentCol);

            return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
        }
    }


    // Usage
//        public static void main(String[] args) {
//            // Example usage
//            int currentRow = 2;
//            int currentCol = 3;
//            int newRow = 0;
//            int newCol = 4;
//
//            ChessPiece knight = new Knight();
//            if (knight.isValideMove(currentRow, currentCol, newRow, newCol)) {
//                // Perform the move
//                System.out.println("Valid move!");
//            } else {
//                System.out.println("Invalid move!");
//            }
//        }



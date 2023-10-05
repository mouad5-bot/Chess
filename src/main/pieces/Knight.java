package main.pieces;

import main.classes.ChessBoard;
import main.classes.ChessPiece;
import main.classes.Color;
import main.classes.Square;

import java.util.Map;

public class Knight extends ChessPiece {
        public Knight(String symbol, Color color, Square position) {
            super(symbol,color, position);
        }

    @Override
    public boolean isValideMove(Square position, Map<String, ChessPiece> boardPieces, boolean isWhitePlayer) {

        // Calculate the row movement direction based on the player's color
        char row = position.getRow();
        char col = position.getColumn();
        char newRow = position.getNewRow();
        char newCol = position.getNewColumn();

        // Check if the move is a valid knight move | abs calcul the absolut value of number
        int rowDiff = Math.abs(newRow - row);
        int colDiff = Math.abs(newCol - col);

        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);

        //return false;
        //return super.isValideMove(position, boardPieces, isWhitePlayer);
    }

    @Override
    public boolean isBeCaptured() {
            return super.isBeCaptured();
        }
    }




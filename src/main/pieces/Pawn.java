package main.pieces;

import main.classes.ChessBoard;
import main.classes.ChessPiece;
import main.classes.Color;
import main.classes.Square;

import java.util.Map;

public class Pawn extends ChessPiece {

    public Pawn(String symbol, Color color, Square position) {
        super(symbol,color, position);
    }

    @Override
    public boolean isValideMove(Square position, Map<String, ChessPiece> boardPieces, boolean isWhitePlayer) {

        // Calculate the row movement direction based on the player's color
        char row = position.getRow();
        char col = position.getColumn();
        char newRow = position.getNewRow();
        char newCol = position.getNewColumn();

        int rowDirection = isWhitePlayer ? 1 : -1 ;

        // Check if the pawn is moving forward by one row
        if (newRow == row + rowDirection && (newCol == ++col || newCol == --col)) {
            return true;
        }

        // Check if the pawn is making its initial two square move
        if (newRow == row + (2 * rowDirection) && newCol == col && row == (isWhitePlayer ? 2 : 7)) {
            return true;
        }

        // Check if the pawn is capturing a piece diagonally
        if (newRow == row + rowDirection && Math.abs(newCol - col) == 1) {
            return true;
        }

        //return false;
        return super.isValideMove(position, boardPieces, isWhitePlayer);
    }

    @Override
    public boolean isBeCaptured() {
        return super.isBeCaptured();
    }

}

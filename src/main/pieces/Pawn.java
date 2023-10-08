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
        // rows and columns
        char row = position.getRow();
        char col = position.getColumn();
        char newRow = position.getNewRow();
        char newCol = position.getNewColumn();
        String emptySquare = "~";

        //objects of pieces
        ChessPiece piece = boardPieces.get(col +""+ row);
        ChessPiece newPiece = boardPieces.get(newCol +""+ newRow);

        // Calculate the row movement direction based on the player's color
        int rowDirection = isWhitePlayer ? 1 : -1 ;

        // Check if the pawn is making its initial two square move
        if (newCol == col && row == (isWhitePlayer ? '2' : '7') && (newRow == row + (2 * rowDirection) || newRow == row + rowDirection)) {
            return true;
        }
        //check that the player doesn't move the piece to back
        if ((isWhitePlayer && row > newRow)) {
            return false;
        }
        if (!isWhitePlayer && row < newRow) {
            return false;
        }

        //check that pawn can go to just empty square in same col
        if(newRow == row + rowDirection && col == newCol && newPiece.symbol == emptySquare){
            return true;
        }

        //Check if the pawn is capturing a piece diagonally
        if ((newRow == row + rowDirection && Math.abs(newCol - col) == 1 )) {
            if (newPiece.symbol != emptySquare && newPiece.color != piece.color){
                return true;
            }
            return false;
        }

         return true;
    }

    @Override
    public boolean isBeCaptured() {
        return true;
    }

}

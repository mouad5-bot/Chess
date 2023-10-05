package main.pieces;

import main.classes.ChessBoard;
import main.classes.ChessPiece;
import main.classes.Color;
import main.classes.Square;

import java.util.Map;

public class Bishop extends ChessPiece {
    public Bishop(String symbol, Color color, Square position) {
        super(symbol , color, position);
    }


        public boolean moveValidation(Square position, Map<String, ChessPiece> boardPieces, boolean isWhitePlayer) {
            ChessPiece newPositionPiece = boardPieces.get(position.getColumn()+""+position.getRow());
            if(newPositionPiece instanceof EmptySquare) ;

            return true;
        }

    public boolean isValideMove(Square position, Map<String, ChessPiece> boardPieces, boolean isWhitePlayer) {

        // Calculate the row movement direction based on the player's color
        char row = position.getRow();
        char col = position.getColumn();
        char newRow = position.getNewRow();
        char newCol = position.getNewColumn();


        return false;
        //return super.isValideMove(position, boardPieces, isWhitePlayer);
    }

        @Override
        public boolean isBeCaptured() {
            return super.isBeCaptured();
        }

}

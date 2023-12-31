package main.pieces;

import main.classes.ChessBoard;
import main.classes.ChessPiece;
import main.classes.Color;
import main.classes.Square;

import java.util.Map;

public class Rook extends ChessPiece {
    public Rook(String symbol, Color color, Square position) {
        super(symbol,color, position);
    }



    public boolean moveValidation(Square position, Map<String, ChessPiece> boardPieces, boolean isWhitePlayer) {
        ChessPiece newPositionPiece = boardPieces.get(position.getColumn()+""+position.getRow());
        if(newPositionPiece instanceof EmptySquare) ;

        return true;
    }

    @Override
    public boolean isValideMove(Square position, Map<String, ChessPiece> boardPieces, boolean isWhitePlayer) {
        return false;
        //return super.isValideMove(position, boardPieces, isWhitePlayer);
    }

    @Override
    public boolean isBeCaptured() {
        return super.isBeCaptured();
    }
}
    
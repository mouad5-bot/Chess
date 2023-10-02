package main.pieces;

import main.classes.ChessBoard;
import main.classes.ChessPiece;
import main.classes.Color;
import main.classes.Square;

import java.util.Map;

public class King extends ChessPiece {
    public King(String symbol, Color color, Square position) {
        super(symbol,color, position);
    }


    public boolean moveValidation(Square position, Map<String, ChessPiece> boardPieces, boolean isWhitePlayer) {
        ChessPiece newPositionPiece = boardPieces.get(position.getColumn()+""+position.getRow());
        if(newPositionPiece instanceof EmptySquare) ;

        return true;
    }

    @Override
    public boolean isBeCaptured() {
        return super.isBeCaptured();
    }
    public boolean isCheck(){
        return true;
    }
    public boolean isCheckMate(){
        return true;
    }
}

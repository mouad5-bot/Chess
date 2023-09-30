package main.pieces;

import main.classes.ChessBoard;
import main.classes.ChessPiece;
import main.classes.Color;
import main.classes.Square;

public class King extends ChessPiece {
    public King(String symbol, Color color, Square position) {
        super(symbol,color, position);
    }

    public boolean isCheck(){
        return true;
    }
    public boolean isCheckMate(){
        return true;
    }
}

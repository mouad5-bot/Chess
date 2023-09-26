package main.pieces;

import main.classes.ChessBoard;
import main.classes.ChessPiece;
import main.classes.Color;
import main.classes.Square;

public class King extends ChessPiece {
    public King(Square position, ChessBoard board, Color color) {
        super(position, board, color);
    }

    public boolean isCheck(){
        return true;
    }
    public boolean isCheckMate(){
        return true;
    }
}

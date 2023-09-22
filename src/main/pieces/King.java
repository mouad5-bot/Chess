package main.pieces;

import main.model.ChessBoard;
import main.model.ChessPiece;
import main.model.Color;
import main.model.Square;

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

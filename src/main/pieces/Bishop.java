package main.pieces;

import main.classes.ChessBoard;
import main.classes.ChessPiece;
import main.classes.Color;
import main.classes.Square;

public class Bishop extends ChessPiece {
    public Bishop(String symbol, Color color, Square position) {
        super(symbol , color, position);
    }

    @Override
    public boolean isValideMove() {
        return true;
    }
}

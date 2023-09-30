package main.pieces;

import main.classes.ChessPiece;
import main.classes.Color;
import main.classes.Square;

public class EmptySquare  extends ChessPiece {
    public EmptySquare(String symbol, Color color, Square position) {
        super(symbol,color, position);
    }
}
package main.pieces;

import main.classes.ChessBoard;
import main.classes.ChessPiece;
import main.classes.Color;
import main.classes.Square;

public class Queen extends ChessPiece {
    public Queen(String symbol, Color color, Square position) {
        super(symbol,color, position);
    }
}

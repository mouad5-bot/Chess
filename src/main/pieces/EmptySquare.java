package main.pieces;

import main.classes.ChessPiece;
import main.classes.Color;
import main.classes.Square;

import java.util.Map;

public class EmptySquare  extends ChessPiece {
    public EmptySquare(String symbol, Color color, Square position) {
        super(symbol,color, position);
    }

    @Override
    public boolean isValideMove(Square position, Map<String, ChessPiece> boardPieces, boolean isWhitePlayer){
        return false;
    }
}
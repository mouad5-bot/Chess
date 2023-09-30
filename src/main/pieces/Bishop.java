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

    @Override
    public boolean isValideMove(String position, String newPosition, Map<String, ChessPiece> boardPieces) {
//        ChessPiece newPositionPiece = boardPieces.get(newPosition);
//        if(newPositionPiece instanceof EmptySquare) {
//
//        }
        return true;
    }
}

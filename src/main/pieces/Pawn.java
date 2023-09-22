package main.pieces;

import main.model.ChessBoard;
import main.model.ChessPiece;
import main.model.Color;
import main.model.Square;

public class Pawn extends ChessPiece {
    public Pawn(Square position, ChessBoard board, Color color) {
        super(position, board, color);
    }
}

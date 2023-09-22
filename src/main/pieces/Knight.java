package main.pieces;

import main.model.ChessBoard;
import main.model.ChessPiece;
import main.model.Color;
import main.model.Square;

public class Knight extends ChessPiece {
    public Knight(Square position, ChessBoard board, Color color) {
        super(position, board, color);
    }
}

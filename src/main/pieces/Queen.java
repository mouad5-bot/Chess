package main.pieces;

import main.model.ChessBoard;
import main.model.ChessPiece;
import main.model.Color;
import main.model.Square;

public class Queen extends ChessPiece {
    public Queen(Square position, ChessBoard board, Color color) {
        super(position, board, color);
    }
}

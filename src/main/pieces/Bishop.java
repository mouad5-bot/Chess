package main.pieces;

import main.classes.ChessBoard;
import main.classes.ChessPiece;
import main.classes.Color;
import main.classes.Square;

public class Bishop extends ChessPiece {
    public Bishop(Square position, ChessBoard board, Color color) {
        super(position, board, color);
    }

    Square square = new Square();

    @Override
    public boolean isValideMove() {
        return super.isValideMove();
    }
}

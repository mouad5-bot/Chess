package main.pieces;

import main.model.ChessBoard;
import main.model.ChessPiece;
import main.model.Color;
import main.model.Square;

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

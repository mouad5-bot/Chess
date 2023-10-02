package main.pieces;

import main.classes.ChessBoard;
import main.classes.ChessPiece;
import main.classes.Color;
import main.classes.Square;

import java.util.Map;

public class Queen extends ChessPiece {
    public Queen(String symbol, Color color, Square position) {
        super(symbol,color, position);
    }

//    @Override
//    public boolean isValideMove(Square position, Map<String, ChessPiece> boardPieces) {    }
//        return true;
//    }

    @Override
    public boolean isValideMove(Square position, Map<String, ChessPiece> boardPieces, boolean isWhitePlayer) {
        return super.isValideMove(position, boardPieces, isWhitePlayer);
    }

    @Override
    public boolean isBeCaptured() {
        return super.isBeCaptured();
    }
}

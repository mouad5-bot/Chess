package main.pieces;

import main.classes.ChessBoard;
import main.classes.ChessPiece;
import main.classes.Color;
import main.classes.Square;

import java.util.Map;

public class Knight extends ChessPiece {
        public Knight(String symbol, Color color, Square position) {
            super(symbol,color, position);
        }


        public boolean isValideMove(int currentRow, int currentCol, int newRow, int newCol) {
            // Check if the move is a valid knight move | abs calcul the absolut value of number
            int rowDiff = Math.abs(newRow - currentRow);
            int colDiff = Math.abs(newCol - currentCol);

            return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
        }


        public boolean moveValidation(Square position, Map<String, ChessPiece> boardPieces, boolean isWhitePlayer) {
            ChessPiece newPositionPiece = boardPieces.get(position.getColumn()+""+position.getRow());
            if(newPositionPiece instanceof EmptySquare) ;

            return true;
        }

        @Override
        public boolean isBeCaptured() {
            return super.isBeCaptured();
        }
    }




package main.classes;

import java.util.Map;

public class ChessPiece {
    public String symbol;
    public Square position;
    public Color color;
    private static final int BOARD_SIZE = 8;

    public ChessPiece(){};
    public ChessPiece(String symbol, Color color, Square position) {
        this.symbol = symbol;
        this.color = color;
        this.position = position;
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "symbol='" + symbol + '\'' +
                ", position=" + position +
                ", color=" + color +
                '}';
    }

    public boolean isValideMove(Square position, Map<String, ChessPiece> boardPieces, boolean isWhitePlayer){
        if ( position.getNewRow() < 0 || position.getNewRow() >= BOARD_SIZE || position.getNewColumn() < 0 || position.getNewColumn() >= BOARD_SIZE) {
            return false;
        }
        return true;
    }
    public boolean isBeCaptured(){
        return true;
    }

}

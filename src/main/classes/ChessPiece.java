package main.classes;

import java.util.Map;

public class ChessPiece {
    public String symbol;
    public Square position;
    public Color color;
    private static final char BOARD_SIZE = '8';

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
        return true;
    }
    public boolean isBeCaptured(){
        return true;
    }

}

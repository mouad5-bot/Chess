package main.classes;

import java.util.Map;

public abstract class ChessPiece {
    public String symbol;
    public Square position;
    public Color color;

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

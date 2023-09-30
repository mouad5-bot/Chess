package main.classes;

public class ChessPiece {
    public String symbol;
    public Square position;
    public Color color;

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

    public boolean isValideMove(){
        return true;
    }
    public boolean isBeCaptured(){
        return true;
    }

}

package main.model;

public class ChessPiece {
    public Square position;
    public ChessBoard board;
    public Color color;

    public ChessPiece(Square position, ChessBoard board, Color color) {
        this.position = position;
        this.board = board;
        this.color = color;
    }
     public boolean isValideMove(){
        return true;
    }
    public boolean isBeCaptured(){
        return true;
    }

}

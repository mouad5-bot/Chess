package main.model;

public class ChessPiece {
    public Square position;
    public ChessBoard board;

    public ChessPiece(Square position, ChessBoard board) {
        this.position = position;
        this.board = board;
    }
    public boolean isValideMove(){
        return true;
    }
    public boolean isBeCaptured(){
        return true;
    }
}

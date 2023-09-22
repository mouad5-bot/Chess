package main.model;

import java.nio.channels.Pipe;

public class Move {
    private Square startSquare;
    private Square endSquare;
    private ChessPiece[][] piece;
    private Player player;

    public Square getStartSquare() {
        return startSquare;
    }

    public void setStartSquare(Square startSquare) {
        this.startSquare = startSquare;
    }

    public Square getEndSquare() {
        return endSquare;
    }

    public void setEndSquare(Square endSquare) {
        this.endSquare = endSquare;
    }

    public ChessPiece[][] getPiece() {
        return piece;
    }

    public void setPiece(ChessPiece[][] piece) {
        this.piece = piece;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void move(){

    }
}

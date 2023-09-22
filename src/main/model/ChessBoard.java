package main.model;


import java.util.ArrayList;

public class ChessBoard {
    private Square position;
    private ChessPiece[][] piece;
    private ChessBoard board;
    private Color color;

    public ChessBoard displayBoard(){
        return this;
    }
}

package main;

import main.classes.ChessBoard;
import main.classes.Color;
import main.classes.Square;
import main.pieces.Bishop;

public class Main {
    public static void main(String[] args) {

        Color color = Color.Black;
        System.out.println("THE COLOR YOU CHOOSE IS :  " + color);

        ChessBoard chessBoard = new ChessBoard();
        chessBoard.play();
    }
}
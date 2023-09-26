package main;

import main.classes.ChessBoard;
import main.classes.Color;

public class Main {
    public static void main(String[] args) {
        Color.Colors color = Color.Colors.Black;
        System.out.println("THE COLOR YOU CHOOSE IS :  " + color);

        ChessBoard chessBoard = new ChessBoard();
        chessBoard.play();
    }
}
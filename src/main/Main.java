package main;

import main.classes.ChessBoard;
import main.classes.Color;

public class Main {
    public static void main(String[] args) {
        Color color = Color.BLACK;
        System.out.println("THE COLOR YOU CHOOSE IS :  " + color);

        ChessBoard chessBoard = new ChessBoard();
        chessBoard.play();
        // ----------- change the conception uml to the new one ---------------
    }
}
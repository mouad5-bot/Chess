package main.classes;

import main.pieces.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChessBoard {
    private static final int BOARD_SIZE = 8;
    private static final char EMPTY_SQUARE = '~';
    private List<ChessPiece> listOfPieces;

    public ChessBoard() {
        listOfPieces = new ArrayList<>();
        initializeBoard();
    }

    private void initializeBoard() {
        // White pieces
        listOfPieces.add(new Rook("r", Color.White, new Square(0,0)));
        listOfPieces.add(new Knight("n", Color.White, new Square(0,1)));
        listOfPieces.add(new Bishop("b", Color.White, new Square(0,2)));
        listOfPieces.add(new Queen("q", Color.White, new Square(0,3)));
        listOfPieces.add(new King("k", Color.White, new Square(0,4)));
        listOfPieces.add(new Bishop("b", Color.White, new Square(0,5)));
        listOfPieces.add(new Knight("n", Color.White, new Square(0,6)));
        listOfPieces.add(new Rook("r", Color.White, new Square(0,7)));

        for (int i = 0; i < BOARD_SIZE; i++) {
            listOfPieces.add(new Pawn("p", Color.White, new Square(1, i)));
        }

        // Empty squares
        for (int row = 2; row < 6; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                listOfPieces.add(new EmptySquare("~", Color.non, new Square(row, col)));
            }
        }

        // Balck pieces
        for (int i = 0; i < BOARD_SIZE; i++) {
            listOfPieces.add(new Pawn("P", Color.Black, new Square(6, i)));
        }
        listOfPieces.add(new Rook("R", Color.Black, new Square(7, 0)));
        listOfPieces.add(new Rook("N", Color.Black, new Square(7, 1)));
        listOfPieces.add(new Rook("B", Color.Black, new Square(7, 2)));
        listOfPieces.add(new Rook("Q", Color.Black, new Square(7, 3)));
        listOfPieces.add(new Rook("K", Color.Black, new Square(7, 4)));
        listOfPieces.add(new Rook("B", Color.Black, new Square(7, 5)));
        listOfPieces.add(new Rook("N", Color.Black, new Square(7, 6)));
        listOfPieces.add(new Rook("R", Color.Black, new Square(7, 7)));

    }

    public void displayBoard() {
        int rowPieceIndex = 8;
        for (int row = 0; row < 64; row++) {
            if (row % 8 == 0)
                System.out.print(rowPieceIndex-- + "  ");

            System.out.print(listOfPieces.get(row).symbol + " ");

            if ((row+1) % 8 == 0)
                System.out.println();
        }
        System.out.println("   a b c d e f g h");
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayBoard();
            System.out.print("Enter the position of the piece to move (e.g., A1): ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the game...");
                break;
            }
            if (input.length() != 2) {
                System.out.println("Invalid input! Please enter the position of the piece to move.");
                continue;
            }
            char column = Character.toUpperCase(input.charAt(0));
            char row = input.charAt(1);
            if (column < 'a' || column > 'h' || row < '1' || row > '8') {
                System.out.println("Invalid position! Please enter a valid position on the chessboard.");
                continue;
            }
            int rowIndex = row - '1';
            int colIndex = column - 'A';
            System.out.println("Piece at position " + input + " moved.");
        }
        scanner.close();
    }

}
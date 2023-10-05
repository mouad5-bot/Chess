package main.classes;

import main.pieces.*;

import java.util.*;

public class ChessBoard {
    private Map<String, ChessPiece> boardPieces;
    private static final int BOARD_SIZE = 8;
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String WHITE = "\u001B[37m";

    public ChessBoard() {
        boardPieces = new HashMap<>();
        initializeBoardUsingMap();
    }

    public Map<String, ChessPiece> getBoardPieces() {
        return boardPieces;
    }

    private void initializeBoardUsingMap() {

        // Black pieces
        boardPieces.put("a8",(new Rook("r", Color.BLACK, new Square())));
        boardPieces.put("b8",(new Knight("n", Color.BLACK, new Square())));
        boardPieces.put("c8",(new Bishop("b", Color.BLACK, new Square())));
        boardPieces.put("d8",(new Queen("q", Color.BLACK, new Square())));
        boardPieces.put("e8",(new King("k", Color.BLACK, new Square())));
        boardPieces.put("f8",(new Bishop("b", Color.BLACK, new Square())));
        boardPieces.put("g8",(new Knight("n", Color.BLACK, new Square())));
        boardPieces.put("h8",(new Rook("r", Color.BLACK, new Square())));
        char alpha = 'a';
        for (int i = 0; i < BOARD_SIZE; i++) {
            boardPieces.put(alpha++ + "7",(new Pawn("p", Color.BLACK, new Square())));
        }

        // Empty squares
        int index = 6;
        for (int row = 2; row < 6; row++) {
            alpha = 'a';
            for (int col = 0; col < BOARD_SIZE; col++) {
                boardPieces.put(alpha++ + "" + index, (new EmptySquare("~", Color.NONE, new Square())));
            }
            index--;
        }

        // White pieces
        alpha = 'a';
        for (int i = 0; i < BOARD_SIZE; i++) {
            boardPieces.put(alpha++ + "2",(new Pawn("P", Color.WHITE, new Square())));
        }
        boardPieces.put("a1",(new Rook("R", Color.WHITE, new Square())));
        boardPieces.put("b1",(new Knight("N", Color.WHITE, new Square())));
        boardPieces.put("c1",(new Bishop("B", Color.WHITE, new Square())));
        boardPieces.put("d1",(new Queen("Q", Color.WHITE, new Square())));
        boardPieces.put("e1",(new King("K", Color.WHITE, new Square())));
        boardPieces.put("f1",(new Bishop("B", Color.WHITE, new Square())));
        boardPieces.put("g1",(new Knight("N", Color.WHITE, new Square())));
        boardPieces.put("h1",(new Rook("R", Color.WHITE, new Square())));

    }

    public void displayBoard() {
        for (int row = BOARD_SIZE; row > 0; row--) {
            System.out.print(row + "  ");
            char alpha = 'a';
            for (int i = 0; i < BOARD_SIZE ; i++) {
                System.out.print(boardPieces.get(alpha +""+ row).symbol + " ");
                alpha++;
            }
            System.out.println();
        }
        System.out.println("   a b c d e f g h");
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayBoard();
            System.out.print("Enter the position of the piece to move (e.g., a2): ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the game...");
                break;

            }
            if (input.length() != 2) {
                System.out.println(RED+"Invalid input!" + RESET + "Please enter the position of the piece to move.");
                continue;
            }

            char column = Character.toLowerCase(input.charAt(0));
            char row = input.charAt(1);

            if (column < 'a' || column > 'h' || row < '1' || row > '8') {
                System.out.println(RED +"Invalid position!" + RESET + "Please enter a valid position on the chessboard.");
                continue;
            }

            System.out.print("Enter the position of the square to move your piece (e.g., a4):");
            String currentInput = scanner.nextLine().trim();

            char newCol = Character.toLowerCase(currentInput.charAt(0));
            char newRow = currentInput.charAt(1);

            Square position = new Square(row, column, newRow, newCol);

            System.out.println("this is old position : " + column + "" + row);
            System.out.println("this is the current position : " + newCol + "" + newRow);
            Move move = new Move();
            move.move(position, this);
        }
        scanner.close();
    }

}
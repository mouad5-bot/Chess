package main.classes;

import java.util.Scanner;

public class ChessBoard {
    private static final int BOARD_SIZE = 8;
    private static final char EMPTY_SQUARE = '~';
    private char[][] board;

    public ChessBoard() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        initializeBoard();
    }

    private void initializeBoard() {
        // White pieces
        board[0][0] = 'r';
        board[0][1] = 'n';
        board[0][2] = 'b';
        board[0][3] = 'q';
        board[0][4] = 'k';
        board[0][5] = 'b';
        board[0][6] = 'n';
        board[0][7] = 'r';
        for (int i = 0; i < BOARD_SIZE; i++) {
            board[1][i] = 'p';
        }

        // Balck pieces
        board[7][0] = 'R';
        board[7][1] = 'N';
        board[7][2] = 'B';
        board[7][3] = 'Q';
        board[7][4] = 'K';
        board[7][5] = 'B';
        board[7][6] = 'N';
        board[7][7] = 'R';
        for (int i = 0; i < BOARD_SIZE; i++) {
            board[6][i] = 'P';
        }

        // Empty squares
        for (int row = 2; row < 6; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {

                board[row][col] = EMPTY_SQUARE;
            }
        }
    }

    public void displayBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            System.out.print((row + 1) + "  ");
            for (int col = 0; col < BOARD_SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
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
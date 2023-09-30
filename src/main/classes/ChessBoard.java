package main.classes;

import main.pieces.*;

import java.util.*;

public class ChessBoard {
    private static final int BOARD_SIZE = 8;
    private List<ChessPiece> listOfPieces;

    private Map<String, ChessPiece> boardPieces;

    public ChessBoard() {
       // listOfPieces = new ArrayList<>();
        boardPieces = new HashMap<>();
        //initializeBoard();
        initializeBoardUsingMap();
    }

    public Map<String, ChessPiece> getBoardPieces() {
        return boardPieces;
    }


//    private void initializeBoard() {
//        // White pieces
//        listOfPieces.add(new Rook("r", Color.WHITE, new Square(0,0)));
//        listOfPieces.add(new Knight("n", Color.WHITE, new Square(0,1)));
//        listOfPieces.add(new Bishop("b", Color.WHITE, new Square(0,2)));
//        listOfPieces.add(new Queen("q", Color.WHITE, new Square(0,3)));
//        listOfPieces.add(new King("k", Color.WHITE, new Square(0,4)));
//        listOfPieces.add(new Bishop("b", Color.WHITE, new Square(0,5)));
//        listOfPieces.add(new Knight("n", Color.WHITE, new Square(0,6)));
//        listOfPieces.add(new Rook("r", Color.WHITE, new Square(0,7)));
//
//        for (int i = 0; i < BOARD_SIZE; i++) {
//            listOfPieces.add(new Pawn("p", Color.WHITE, new Square(1, i)));
//        }
//
//        // Empty squares
//        for (int row = 2; row < 6; row++) {
//            for (int col = 0; col < BOARD_SIZE; col++) {
//                listOfPieces.add(new EmptySquare("~", Color.NON, new Square(row, col)));
//            }
//        }
//
//        // Balck pieces
//        for (int i = 0; i < BOARD_SIZE; i++) {
//            listOfPieces.add(new Pawn("P", Color.BLACK, new Square(6, i)));
//        }
//        listOfPieces.add(new Rook("R", Color.BLACK, new Square(7, 0)));
//        listOfPieces.add(new Rook("N", Color.BLACK, new Square(7, 1)));
//        listOfPieces.add(new Rook("B", Color.BLACK, new Square(7, 2)));
//        listOfPieces.add(new Rook("Q", Color.BLACK, new Square(7, 3)));
//        listOfPieces.add(new Rook("K", Color.BLACK, new Square(7, 4)));
//        listOfPieces.add(new Rook("B", Color.BLACK, new Square(7, 5)));
//        listOfPieces.add(new Rook("N", Color.BLACK, new Square(7, 6)));
//        listOfPieces.add(new Rook("R", Color.BLACK, new Square(7, 7)));
//
//    }
    private void initializeBoardUsingMap() {

        //boardPieces.get("a8").isValideMove("a8", "a3", boardPieces);
        // Black pieces
        boardPieces.put("a8", (new Rook("r", Color.BLACK, new Square(0,0))));
        boardPieces.put("b8",(new Knight("n", Color.BLACK, new Square(0,1))));
        boardPieces.put("c8",(new Bishop("b", Color.BLACK, new Square(0,2))));
        boardPieces.put("d8",(new Queen("q", Color.BLACK, new Square(0,3))));
        boardPieces.put("e8",(new King("k", Color.BLACK, new Square(0,4))));
        boardPieces.put("f8",(new Bishop("b", Color.BLACK, new Square(0,5))));
        boardPieces.put("g8",(new Knight("n", Color.BLACK, new Square(0,6))));
        boardPieces.put("h8",(new Rook("r", Color.BLACK, new Square(0,7))));
        char alpha = 'a';
        for (int i = 0; i < BOARD_SIZE; i++) {
            boardPieces.put(alpha++ + "7",(new Pawn("p", Color.BLACK, new Square(1, i))));
        }

        // Empty squares
        int index = 6;
        for (int row = 2; row < 6; row++) {
            alpha = 'a';
            for (int col = 0; col < BOARD_SIZE; col++) {
                boardPieces.put(alpha++ + "" + index, (new EmptySquare("~", Color.NON, new Square(row, col))));
            }
            index--;
        }

        // White pieces
        alpha = 'a';
        for (int i = 0; i < BOARD_SIZE; i++) {
            boardPieces.put(alpha++ + "2",(new Pawn("P", Color.WHITE, new Square(6, i))));
        }
        boardPieces.put("a1",(new Rook("R", Color.WHITE, new Square(7, 0))));
        boardPieces.put("b1",(new Rook("N", Color.WHITE, new Square(7, 1))));
        boardPieces.put("c1",(new Rook("B", Color.WHITE, new Square(7, 2))));
        boardPieces.put("d1",(new Rook("Q", Color.WHITE, new Square(7, 3))));
        boardPieces.put("e1",(new Rook("K", Color.WHITE, new Square(7, 4))));
        boardPieces.put("f1",(new Rook("B", Color.WHITE, new Square(7, 5))));
        boardPieces.put("g1",(new Rook("N", Color.WHITE, new Square(7, 6))));
        boardPieces.put("h1",(new Rook("R", Color.WHITE, new Square(7, 7))));

    }

//    public void displayBoard() {
//        int rowPieceIndex = 8;
//        for (int row = 0; row < 64; row++) {
//            if (row % 8 == 0)
//                System.out.print(rowPieceIndex-- + "  ");
//
//            System.out.print(listOfPieces.get(row).symbol + " ");
//
//            if ((row+1) % 8 == 0)
//                System.out.println();
//        }
//        System.out.println("   a b c d e f g h");
//    }
    public void displayBoard() {
        int rowPieceIndex = 8;
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
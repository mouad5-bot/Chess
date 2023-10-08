package main.classes;

import main.pieces.EmptySquare;

import java.util.ArrayList;
import java.util.Stack;

public class Move {
    private Square position;
    private Player player;

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String WHITE = "\u001B[37m";


    public Square getPosition() {
        return position;
    }

    public void setPosition(Square position) {
        this.position = position;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void move(Square position, ChessBoard chessBoard, ArrayList<String> pieceCaptured) {
        char row = position.getRow();
        char col = position.getColumn();
        char newRow = position.getNewRow();
        char newCol = position.getNewColumn();
        String emptySqaure = "~";

        Player player;

        ChessPiece chessPiece = chessBoard.getBoardPieces().get(col +""+ row);
        ChessPiece newChessPiece = chessBoard.getBoardPieces().get(newCol +""+ newRow);
        ChessPiece tempChessPiece;

//        tempChessPiece = chessPiece;
//        chessPiece = newChessPiece;
//        newChessPiece = tempChessPiece;

        Color color = chessBoard.getBoardPieces().get(col + "" + row).color;
        player = new Player(color);
    
        if (chessPiece.isValideMove(position, chessBoard.getBoardPieces(), player.isWhitePlayer())) {
            System.out.println(GREEN + "valid move" + RESET);

            if (newChessPiece.symbol != emptySqaure && newChessPiece.color != chessPiece.color){
                chessBoard.getBoardPieces().put(col +""+ row, newChessPiece);
                chessBoard.getBoardPieces().put(newCol +""+ newRow, chessPiece);

                pieceCaptured.add(newChessPiece.symbol);
                newChessPiece.symbol="~";
            }

            chessBoard.getBoardPieces().put(col +""+ row, newChessPiece);
            chessBoard.getBoardPieces().put(newCol +""+ newRow, chessPiece);
        } else {
            System.out.println(RED + "Ops.. invalid move! try again" + RESET);
        }
    
    }

}

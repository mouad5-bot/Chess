package main.classes;

public class Player {
    private Color pieceColor;

    public Player(){}

    public Player(Color pieceColor) {
        this.pieceColor = pieceColor;
    }

    public Color getPieceColor() {
        return pieceColor;
    }

    public boolean isWhitePlayer(){
        return pieceColor.equals(Color.WHITE);
    }

    public void makeMove(){

    }
}

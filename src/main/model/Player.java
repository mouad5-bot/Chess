package main.model;

public class Player {
    private Color pieceColor;

    public Color getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(Color pieceColor) {
        this.pieceColor = pieceColor;
    }

    public boolean isWhitePlayer(){
        return pieceColor.equals(Color.Colors.White);
    }

    public void makeMove(){

    }
}

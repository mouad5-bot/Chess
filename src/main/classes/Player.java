package main.classes;

public class Player {
    private Color pieceColor;

    public Color getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(Color pieceColor) {
        this.pieceColor = pieceColor;
    }

    public boolean isWhitePlayer(){
        return pieceColor.equals(Color.White);
    }

    public void makeMove(){

    }
}

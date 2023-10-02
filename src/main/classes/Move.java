package main.classes;

public class Move {
    private Square position;
    private ChessPiece[][] piece;
    private Player player;

    public Square getPosition() {
        return position;
    }

    public void setPosition(Square position) {
        this.position = position;
    }

    public ChessPiece[][] getPiece() {
        return piece;
    }

    public void setPiece(ChessPiece[][] piece) {
        this.piece = piece;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

public void move(Square position) {
    System.out.println("this is row and col : "+ position.getColumn() + "" + position.getRow());
    // Assuming chessBoard is an already initialized ChessBoard instance
    ChessBoard chessBoard = new ChessBoard();
    ChessPiece chessPiece = new ChessPiece();

    String symbol = chessBoard.getBoardPieces().get(position.getColumn() + "" + position.getRow()).symbol;
    Color color = chessBoard.getBoardPieces().get(position.getColumn() + "" + position.getRow()).color;

    new ChessPiece(symbol, color, position);

    if (chessPiece != null)
        System.out.println("You want to move this piece: " + symbol);
        System.out.println("You choose this color: " + color.name());
        System.out.println("You are in this position: " + position.toString());

}

}

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

    ChessBoard chessBoard = new ChessBoard();
    Player player;
    ChessPiece chessPiece;

    String symbol = chessBoard.getBoardPieces().get(position.getColumn() + "" + position.getRow()).symbol;
    Color color = chessBoard.getBoardPieces().get(position.getColumn() + "" + position.getRow()).color;

    chessPiece = new ChessPiece(symbol, color, position);
    player = new Player(color);

    if(chessPiece.isValideMove(position, chessBoard.getBoardPieces(), player.isWhitePlayer())){
        System.out.println("valid move");
    }else{
        System.out.println("Opps invalid move !");
    }


}

}

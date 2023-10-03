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
    char row = position.getRow();
    char col = position.getColumn();
    char newRow = position.getNewRow();
    char newCol = position.getNewColumn();

    ChessBoard chessBoard = new ChessBoard();
    Player player;

    ChessPiece chessPiece = chessBoard.getBoardPieces().get(col +""+ row);
    ChessPiece newChessPiece = chessBoard.getBoardPieces().get(newCol +""+ newRow);

    Color color = chessBoard.getBoardPieces().get(col + "" + row).color;
    player = new Player(color);

    if (chessPiece.isValideMove(position, chessBoard.getBoardPieces(), player.isWhitePlayer())) {
        chessBoard.getBoardPieces(col +""+ row, chessPiece)
        System.out.println("valid move");
    } else {
        System.out.println("Ops invalid move !");
    }


}

}

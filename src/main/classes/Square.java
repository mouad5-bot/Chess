package main.classes;

public class Square {
    private char row;
    private char column;
    private char newRow;
    private char newColumn;

    public Square() {}
    public Square(char row, char column, char newRow, char newColumn) {
        this.row = row;
        this.column = column;
        this.newRow = newRow;
        this.newColumn = newColumn;
    }

    public char getRow() {
        return row;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public void setColumn(char column) {
        this.column = column;
    }

    public char getNewRow() {
        return newRow;
    }

    public void setNewRow(char newRow) {
        this.newRow = newRow;
    }

    public char getNewColumn() {
        return newColumn;
    }

    public void setNewColumn(char newColumn) {
        this.newColumn = newColumn;
    }

    @Override
    public String toString() {
        return "Square{" +
                "row=" + row +
                ", column=" + column +
                ", newRow=" + newRow +
                ", newColumn=" + newColumn +
                '}';
    }

    public String newPosition(char newRow, char newColumn){
        return newColumn + "" + newRow;
    }
    public String Position(char row, char column){
        return row + "" + column;
    }

}

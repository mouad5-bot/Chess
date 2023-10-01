package main.classes;

public class Square {
    private int row;
    private char column;
    private int newRow;
    private char newColumn;

    public Square(){}
    public Square(int row, char column){
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public void setColumn(char column) {
        this.column = column;
    }

    public int getNewRow() {
        return newRow;
    }

    public void setNewRow(int newRow) {
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

    public String newPosition(int newRow, char newColumn){
        return newColumn + "" + newRow;
    }
    public String Position(int row, char column){
        return row + "" + column;
    }

}

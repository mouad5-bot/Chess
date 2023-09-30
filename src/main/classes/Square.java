package main.classes;

public class Square {
    private int row;
    private int column;
    private int newRow;
    private int newColumn;

    public Square(){}
    public Square(int row, int column){
        this.row = row;
        this.column = column;
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

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getNewRow() {
        return newRow;
    }

    public void setNewRow(int newRow) {
        this.newRow = newRow;
    }

    public int getNewColumn() {
        return newColumn;
    }

    public void setNewColumn(int newColumn) {
        this.newColumn = newColumn;
    }
}

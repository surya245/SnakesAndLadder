package io.suryap.models;

public class Cell {
    int row;
    int col;
    int position;
    Mover mover;

    public void setMover(Mover mover) {
        this.mover = mover;
    }

    public Cell(int position) {
        this.position = position;
        this.col = position % 10;
        this.row = position / 10;
        mover = new Self();
}
    public int getPosition() {
        return position;
    }

    public Mover getMover() {
        return mover;
    }
}

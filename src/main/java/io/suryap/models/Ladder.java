package io.suryap.models;

public class Ladder extends Mover {
    Cell toe;
    Cell tip;

    public Ladder(Cell toe, Cell tip) {
        this.toe = toe;
        this.tip = tip;
    }

    @Override
    public Cell getEndPosition(Cell cell){
        return this.tip;
    }
}
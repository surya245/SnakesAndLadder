package io.suryap.models;

public class Self extends Mover {

    @Override
    public Cell getEndPosition(Cell cell) {
        return cell;
    }
}

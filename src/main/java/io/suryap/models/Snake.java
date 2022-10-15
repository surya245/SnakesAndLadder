package io.suryap.models;

public class Snake extends Mover {
    Cell head;
    Cell tail;

    public Snake(Cell head, Cell tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public Cell getEndPosition(Cell cell) {
        return this.tail;
    }
}

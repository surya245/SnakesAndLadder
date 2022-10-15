package io.suryap.services;

import io.suryap.models.Board;
import io.suryap.models.Cell;
import io.suryap.models.Snake;

import java.util.List;
import java.util.Map;

public class SnakeAddition extends MoverAddition {
    Board board;

    public SnakeAddition(Board board) {
        this.board = board;
    }

    @Override
    public Board addMover(Cell head, Cell tail) {
        Map<Cell, Cell> snakes = board.getSnakes();
        Map<Cell,Cell> ladders = board.getLadders();

        if(snakes.containsKey(tail)){
            tail = snakes.get(tail);
        }

        if(!snakes.containsKey(head) && !ladders.containsValue(head)){
            snakes.put(head,tail);
            board.setSnakes(snakes);

            List<Cell> cells = board.getCells();

            head.setMover(new Snake(head,tail));

            cells.set(head.getPosition(),head);

            board.setCells(cells);
        }

        return this.board;
    }
}

package io.suryap.services;

import io.suryap.models.Board;
import io.suryap.models.Cell;
import io.suryap.models.Ladder;

import java.util.List;
import java.util.Map;

public class LadderAddition extends MoverAddition {
    Board board;

    public LadderAddition(Board board) {
        this.board = board;
    }

    @Override
    public Board addMover(Cell toe, Cell tip) {
        Map<Cell,Cell> snakes = board.getSnakes();
        Map<Cell,Cell> ladders = board.getLadders();

        if(ladders.containsKey(tip)){
            tip = ladders.get(tip);
        }

        if(!ladders.containsKey(toe) && snakes.containsValue(toe)){
            ladders.put(toe,tip);
            board.setLadders(ladders);

            List<Cell> cellList = board.getCells();

            toe.setMover(new Ladder(toe,tip));

            cellList.set(toe.getPosition(),toe);

            board.setCells(cellList);
        }

        return this.board;
    }
}

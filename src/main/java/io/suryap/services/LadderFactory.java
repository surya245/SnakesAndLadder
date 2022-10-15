package io.suryap.services;

import io.suryap.models.Board;
import io.suryap.models.Cell;

import java.util.List;

public class LadderFactory extends MoverFactory {
    Board board;
    List<String> ladderPositions;

    public LadderFactory(Board board, List<String> ladderPositions) {
        this.board = board;
        this.ladderPositions = ladderPositions;
    }

    @Override
    public Board makeMover() {
        for(String position : ladderPositions){
            MoverAddition ladderAddition = new LadderAddition(this.board);

            int toePosition = Integer.parseInt(position.split(" ")[0]) - 1;
            int tipPosition = Integer.parseInt(position.split(" ")[1]) - 1;

            Cell toe = this.board.getCells().get(toePosition);
            Cell tip = this.board.getCells().get(tipPosition);

            this.board = ladderAddition.addMover(toe,tip);

        }
        return this.board;
    }
}

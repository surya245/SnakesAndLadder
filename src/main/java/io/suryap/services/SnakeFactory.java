package io.suryap.services;

import io.suryap.models.Board;
import io.suryap.models.Cell;

import java.util.List;

public class SnakeFactory extends MoverFactory {
    Board board;
    List<String> snakePositions;

    public SnakeFactory(Board board, List<String> snakePositions) {
        this.board = board;
        this.snakePositions = snakePositions;
    }

    @Override
    public Board makeMover() {
        for(String position : snakePositions){
            MoverAddition snakeAddition = new SnakeAddition(this.board);
            int headPosition = Integer.parseInt(position.split(" ")[0]) - 1;
            int tailPosition = Integer.parseInt(position.split(" ")[1]) - 1;

            Cell head = this.board.getCells().get(headPosition);
            Cell tail = this.board.getCells().get(tailPosition);

            this.board = snakeAddition.addMover(head,tail);
        }
        return this.board;
    }
}

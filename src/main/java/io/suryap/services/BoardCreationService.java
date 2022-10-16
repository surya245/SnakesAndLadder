package io.suryap.services;

import io.suryap.models.Board;
import io.suryap.models.Cell;

import java.util.ArrayList;
import java.util.List;

public class BoardCreationService {
    CellCreationService cellCreationService;
    int boardSize;
    List<Cell> cells;
    Board board;

    private Board create() {
        for(int i = 0; i < this.boardSize; i++){
            cells.add(cellCreationService.createCell(i));
        }
        this.board = new Board(cells);
        return this.getBoard();
    }

    public Board getBoard() {
        return  this.board;
    }

    public BoardCreationService(CellCreationService cellCreationService,int boardSize) {
        this.cellCreationService = cellCreationService;
        this.boardSize = boardSize;
        this.cells = new ArrayList<>();
        this.create();
    }
}

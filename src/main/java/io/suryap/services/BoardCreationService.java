package io.suryap.services;

import io.suryap.models.Board;

public class BoardCreationService {
    CellCreationService cellCreationService;
    Board board;

    public Board getBoard() {
        return board;
    }

    public BoardCreationService(CellCreationService cellCreationService) {
        this.cellCreationService = cellCreationService;
        this.board = new Board(cellCreationService.getCells());
    }
}

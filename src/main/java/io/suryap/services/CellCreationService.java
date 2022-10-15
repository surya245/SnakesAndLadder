package io.suryap.services;

import io.suryap.models.Cell;

import java.util.ArrayList;
import java.util.List;

public class CellCreationService {
    int numberOfCells;
    List<Cell> cells;

    public List<Cell> getCells() {
        return cells;
    }

    public CellCreationService(int numberOfCells) {
        this.numberOfCells = numberOfCells;

        cells = new ArrayList<>();
        for(int i = 0; i < numberOfCells; i++){
            cells.add(new Cell(i));
        }
    }

}

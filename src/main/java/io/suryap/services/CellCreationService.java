package io.suryap.services;

import io.suryap.models.Cell;


public class CellCreationService {

    public Cell createCell(Integer cellPos) {
        return new Cell(cellPos);
    }

}

package io.suryap.services;

import io.suryap.models.Board;
import io.suryap.models.Cell;

public abstract class MoverAddition {
    public abstract Board addMover(Cell start, Cell end);

}

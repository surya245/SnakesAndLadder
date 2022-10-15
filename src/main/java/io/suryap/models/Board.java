package io.suryap.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private List<Cell> cells;
    private Map<Cell, Cell> snakes;
    private Map<Cell, Cell> ladders;

    public List<Cell> getCells() {
        return cells;
    }

    public Map<Cell, Cell> getSnakes() {
        return snakes;
    }

    public void setSnakes(Map<Cell, Cell> snakes) {
        this.snakes = snakes;
    }

    public Map<Cell, Cell> getLadders() {
        return ladders;
    }

    public void setLadders(Map<Cell, Cell> ladders) {
        this.ladders = ladders;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }

    public Board(List<Cell> cells) {
        this.cells = cells;
        snakes = new HashMap<>();
        ladders = new HashMap<>();
    }
}



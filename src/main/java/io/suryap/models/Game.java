package io.suryap.models;

import java.util.List;

public class Game{
    Board board;
    List<Player> players;

    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Game(Board board, List<Player> players) {
        this.board = board;
        this.players = players;
    }
}
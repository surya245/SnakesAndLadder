package io.suryap.models;

public class Player {
    String playerName;
    Cell playerCell;
    PlayerStatus playerStatus;

    public PlayerStatus getPlayerStatus() {
        return playerStatus;
    }

    public void setPlayerStatus(PlayerStatus playerStatus) {
        this.playerStatus = playerStatus;
    }

    public void setPlayerCell(Cell playerCell) {
        this.playerCell = playerCell;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Cell getPlayerCell() {
        return playerCell;
    }

    public Player(String playerName, Cell playerCell) {
        this.playerName = playerName;
        this.playerCell = playerCell;
        playerStatus = PlayerStatus.PLAYING;
    }

}

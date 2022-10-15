package io.suryap.services;

import io.suryap.models.Board;
import io.suryap.models.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerCreationService {
    List<String> playerNames;
    BoardCreationService boardCreationService;
    List<Player> players;


    public PlayerCreationService(List<String> playerNames, BoardCreationService boardCreationService) {
        this.playerNames = playerNames;
        this.boardCreationService = boardCreationService;
        Board board = boardCreationService.getBoard();

        players = new ArrayList<>();
        for(String name : this.playerNames){
            players.add(new Player(name,board.getCells().get(0)));
        }
    }


    public List<Player> getPlayers() {
        return players;
    }

}

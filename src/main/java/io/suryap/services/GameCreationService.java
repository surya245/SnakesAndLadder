package io.suryap.services;

import io.suryap.models.Board;
import io.suryap.models.Game;
import io.suryap.models.Player;

import java.util.ArrayList;
import java.util.List;

public class GameCreationService {
    PlayerCreationService playerCreationService;
    BoardCreationService boardCreationService;
    Game game;

    public Game getGame() {
        return game;
    }

    public GameCreationService(BoardCreationService boardCreationService, PlayerCreationService playerCreationService) {
        this.playerCreationService = playerCreationService;
        this.boardCreationService = boardCreationService;
        this.game = new Game(boardCreationService.getBoard(),playerCreationService.getPlayers());
    }


}

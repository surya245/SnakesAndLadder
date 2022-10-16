package io.suryap;

import io.suryap.models.*;
import io.suryap.services.*;

import java.nio.file.Paths;
import java.util.List;


public class Main {
    static int BOARD_SIZE = 100;
    static String INPUT_FILE_PATH = "src/main/resources/InputFile.txt";
    static int DICE_LIMIT = 6;

    public static void main(String[] args) {
        FileReader fileReader = new FileReader(Paths.get(INPUT_FILE_PATH));

        CellCreationService cellCreationService =
                new CellCreationService();

        BoardCreationService boardCreationService =
                new BoardCreationService(cellCreationService,BOARD_SIZE);

        List<String> playerNames = fileReader.getNames();

        PlayerCreationService playerCreationService =
                new PlayerCreationService(playerNames,boardCreationService);

        GameCreationService gameCreationService
                = new GameCreationService(boardCreationService, playerCreationService);

        Game game = gameCreationService.getGame();

        Board board = game.getBoard();

        Dice dice = new Dice(DICE_LIMIT);

        board = new SnakeFactory(board,fileReader.getSnakes()).makeMover();

        board = new LadderFactory(board,fileReader.getLadders()).makeMover();

        Play play = new Play(board,dice,game.getPlayers());

        List<Player> winners = play.play();

        for(Player player : winners){
            System.out.println(player.getPlayerName() + " Rank " + (1+winners.indexOf(player)));
        }
    }
}

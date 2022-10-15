package io.suryap.services;

import io.suryap.models.*;

import java.util.ArrayList;
import java.util.List;

public class Play {
    Board board;
    Dice dice;
    List<Player> players;
    List<Player> winners;
    int rank;

    public Play(Board board, Dice dice, List<Player> players) {
        this.board = board;
        this.dice = dice;
        this.players = players;
        this.winners = new ArrayList<>();
        this.rank = 1;
    }

    public List<Player> play(){

        while (true){
            for(Player player : this.players){
                if(player.getPlayerStatus() == PlayerStatus.WON) continue;

                if(rank == players.size() && player.getPlayerStatus() == PlayerStatus.PLAYING){
                    System.out.println("Sorry!! "+ player.getPlayerName()+" You LOST");
                    return this.winners;
                }

                Cell currCell = player.getPlayerCell();

                int currPos = currCell.getPosition();
                int diceValue = this.dice.rollDice();
                int newPos = Math.min(currPos + diceValue,99);

                Cell newCell = board.getCells().get(newPos);

                Mover mover = newCell.getMover();

                newCell = mover.getEndPosition(newCell);

                System.out.println(player.getPlayerName()+
                        " Moved From " +
                        currPos +
                        " To " +
                        newCell.getPosition()
                );

                player.setPlayerCell(newCell);

                if(newCell.getPosition() == 99){
                    winners.add(player);
                    player.setPlayerStatus(PlayerStatus.WON);
                    rank++;
                }
            }
        }
    }
}

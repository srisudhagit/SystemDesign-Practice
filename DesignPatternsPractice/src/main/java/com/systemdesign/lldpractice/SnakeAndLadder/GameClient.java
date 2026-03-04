package com.systemdesign.lldpractice.SnakeAndLadder;
import java.util.ArrayList;
import java.util.List;

public class GameClient {
    public static void main(String[] args) {
        List<GamePlayer> players = new ArrayList<>();
        players.add(new GamePlayer("Sudha"));
        players.add(new GamePlayer("Sai"));
        players.add(new GamePlayer("Sreyansh"));
        players.add(new GamePlayer("Shanmukh"));

        List<BoardEntity> snakesAndLadders = new ArrayList<>();
        snakesAndLadders.add(new Snake(14, 7));
        snakesAndLadders.add(new Snake(31, 26));
        snakesAndLadders.add(new Snake(38, 3));
        snakesAndLadders.add(new Snake(84, 58));
        snakesAndLadders.add(new Ladder(24, 95));
        snakesAndLadders.add(new Ladder(28, 84));
        snakesAndLadders.add(new Ladder(58, 77));
        snakesAndLadders.add(new Ladder(75, 86));

        Game game1 = new Game.GameBuilder().setPlayers(players)
                .setBoard(new Board(100, snakesAndLadders))
                .setDice(new Dice(1,6))
                .build();

        game1.play();
        
    }
}

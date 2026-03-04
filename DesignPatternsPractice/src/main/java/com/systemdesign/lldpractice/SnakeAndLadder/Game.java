package com.systemdesign.lldpractice.SnakeAndLadder;
import java.util.List;

public class Game {
    
    private List<GamePlayer> players;
    private Board board;
    private Dice dice;
    private GameStatus gameStatus;

    private Game(GameBuilder builder) {
        this.players = builder.players;
        this.board = builder.board;
        this.dice = builder.dice;
        this.gameStatus = GameStatus.GAME_STARTED;
    }

    public void play(){
       if(this.players.size() < 2){
           throw new IllegalStateException("At least 2 players are required to start the game");
       }
       this.gameStatus = GameStatus.GAME_IN_PROGRESS;
       while(gameStatus != GameStatus.GAME_ENDED){
              for(GamePlayer player : players){
                takeTurn(player);
                if(player.getCurrentPosition() == board.getSize()){
                     System.out.println("Player " + player.getName() + " wins the game!");
                     gameStatus = GameStatus.GAME_ENDED;
                     break;
                }
              }
        }
    }

    public void takeTurn(GamePlayer player){
        int rollValue = dice.roll();
        System.out.println("Player " + player.getName() + " rolled a " + rollValue);
        int newPosition = player.getCurrentPosition() + rollValue;
        if(player.getCurrentPosition() == 0 && rollValue != 6){
            System.out.println("Player " + player.getName() + " needs to roll a 6 to start");
            return;
        }
        if(newPosition > board.getSize()){
            System.out.println("Player " + player.getName() + " rolled too high to move");
            return;
        }
        int modPos = board.getPosition(newPosition);
        if(modPos < newPosition){
            System.out.println("Player " + player.getName() + " got bitten by a snake and moved down to " + modPos);
        } else if(modPos > newPosition){
            System.out.println("Player " + player.getName() + " climbed a ladder and moved up to " + modPos);
        } else {
            System.out.println("Player " + player.getName() + " moved to " + modPos);
        }
        player.setCurrentPosition(modPos);
        return;

    }

    public static class GameBuilder{
        private List<GamePlayer> players;
        private Board board;
        private Dice dice;

        public GameBuilder setPlayers(List<GamePlayer> players) {
            this.players = players;
            return this;
        }

        public GameBuilder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public GameBuilder setDice(Dice dice) {
            this.dice = dice;
            return this;
        }

        public Game build() {
            if (players == null || board == null || dice == null) {
                throw new IllegalStateException("Players, Board, and Dice must be provided to build the game");
            }
            return new Game(this);
        }
    }
}

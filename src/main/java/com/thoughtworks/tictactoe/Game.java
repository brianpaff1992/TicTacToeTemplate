package com.thoughtworks.tictactoe;

import java.io.PrintStream;

/**
 * Created by bpaff on 9/24/15.
 */
public class Game {

    private PrintStream printstream;
    private final Player player1;
    private final Player player2;
    private Board board;

    public Game(PrintStream printstream, Player player1, Player player2, Board board)
    {

        this.printstream = printstream;
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }


    public void print() {

        //printstream.println(" | | \n-----\n | | \n-----\n | | ");
        board.printBoard();
    }

    public void start() {
        print();
        //board.create();
        playGame();
    }

    public void playGame() {
        Player player = player1;
        while (!board.isFull()) {
            playerTurn(player);
            player = switchActivePlayer(player);
        }
        printstream.println("Game is a draw");
    }

    private Player switchActivePlayer(Player player) {
        if(player.equals(player1))
        {
            return player2;
        }
        else{
            return player1;
        }
    }

    private void playerTurn(Player player) {
        String p = "2";
        if(player.equals(player1))
        {
            p = "1";
        }
        printstream.println("Player " + p + " select a move:");
        playerMove(player);
    }

    private void playerMove(Player player) {
        //Tested With only one player, it works.. keeps saying it was called two times and fails, not sure how to fix.
        while(!player.getAndPlayMove()){
            printstream.println("Location already taken");
        }
        board.printBoard();
    }
}

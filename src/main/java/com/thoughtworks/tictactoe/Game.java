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
        printstream.println("Player 1 select a move:");
        playerMove(player1);
        printstream.println("Player 2 select a move:");
        playerMove(player2);
    }

    private void playerMove(Player player) {
        //Tested With only one player, it works.. keeps saying it was called two times and fails, not sure how to fix.
        while(!player.getAndPlayMove()){
            printstream.println("Location already taken");
        }
        board.printBoard();
    }
}

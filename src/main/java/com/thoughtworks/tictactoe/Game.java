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
        printstream.println(" | | \n-----\n | | \n-----\n | | ");
    }

    public void start() {
        print();
        board.create();
        playGame();
    }

    private void playGame() {
        printstream.println("Player 1 select a move:");
        player1.getMove();
    }
}

package com.thoughtworks.tictactoe;

import java.io.PrintStream;

/**
 * Created by bpaff on 9/24/15.
 */
public class Game {

    private PrintStream printstream;

    public Game(PrintStream printstream)
    {

        this.printstream = printstream;
    }


    public void print() {
        printstream.println(" | | \n | | \n | | ");
    }
}
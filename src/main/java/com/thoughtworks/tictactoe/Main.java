package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        PrintStream printStream = System.out;
        Game game = new Game(printStream);
        game.start();
    }
}

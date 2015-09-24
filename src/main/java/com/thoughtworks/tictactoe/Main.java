package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        PrintStream printStream = System.out;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PlayerInputReader pir = new PlayerInputReader(reader);
        Map<String, Move> moves = new HashMap<String, Move>();
        moves.put("1", new Move1());
        Player player1 = new Player(pir, moves);
        Player player2 = new Player(pir, moves);
        Game game = new Game(printStream, player1, player2);
        game.start();
    }
}

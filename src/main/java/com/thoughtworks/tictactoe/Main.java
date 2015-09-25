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
        moves.put("2", new Move2());
        moves.put("3", new Move3());
        moves.put("4", new Move4());
        moves.put("5", new Move5());
        moves.put("6", new Move6());
        moves.put("7", new Move7());
        moves.put("8", new Move8());
        moves.put("9", new Move9());
        Row row1 = new Row(new Space("1"), new Space("2"), new Space("3"));
        Row row2 = new Row(new Space("4"), new Space("5"), new Space("6"));
        Row row3 = new Row(new Space("7"), new Space("8"), new Space("9"));
        Board board = new Board(row1, row2, row3, printStream);
        Player player1 = new Player(pir, moves, "O", board);
        Player player2 = new Player(pir, moves, "X", board);
        Game game = new Game(printStream, player1, player2, board);
        game.start();
    }
}

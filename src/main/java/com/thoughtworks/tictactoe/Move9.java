package com.thoughtworks.tictactoe;

/**
 * Created by bpaff on 9/24/15.
 */
public class Move9 implements Move {
    @Override
    public void play(Board board, String player) {
        board.spacePlayed("9", player);
    }
}

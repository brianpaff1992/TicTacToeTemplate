package com.thoughtworks.tictactoe;

/**
 * Created by bpaff on 9/24/15.
 */
public class Move8 implements Move {
    @Override
    public void play(Board board, String player) {
        board.spacePlayed("8", player);
    }
}

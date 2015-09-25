package com.thoughtworks.tictactoe;

/**
 * Created by bpaff on 9/24/15.
 */
public class Move6 implements Move {
    @Override
    public boolean play(Board board, String player) {
        return board.spacePlayed("6", player);
    }
}

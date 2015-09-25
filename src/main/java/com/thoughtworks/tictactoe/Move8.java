package com.thoughtworks.tictactoe;

/**
 * Created by bpaff on 9/24/15.
 */
public class Move8 implements Move {
    @Override
    public boolean play(Board board, String player) {
        return board.spacePlayed("8", player);
    }
}

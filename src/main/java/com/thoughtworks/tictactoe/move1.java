package com.thoughtworks.tictactoe;

/**
 * Created by bpaff on 9/24/15.
 */
public class Move1 implements Move {
    @Override
    public void play(Board board,String player) {
        board.SpacePlayed("1", player);

    }
}

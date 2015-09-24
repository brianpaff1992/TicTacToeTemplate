package com.thoughtworks.tictactoe;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by bpaff on 9/24/15.
 */
public class Move1Test {

    @Test
    public void shouldCallBoardsSpacePlayedWhenPlayerMakesMove(){
        String player = "X";
        Board board = mock(Board.class);

        Move1 move = new Move1();
        move.play(board,player);

        verify(board).spacePlayed("1", player);
    }
}
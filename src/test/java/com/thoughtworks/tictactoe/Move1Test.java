package com.thoughtworks.tictactoe;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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

    @Test
    public void shouldReturnFalseWhenMoveWasNotPlaced(){
        String player = "X";
        Board board = mock(Board.class);

        Move1 move = new Move1();
        when(board.spacePlayed("1", player)).thenReturn(false);

        assertFalse(move.play(board, player));
    }

    @Test
    public void shouldReturnTrueWhenMoveWasNotPlaced(){
        String player = "X";
        Board board = mock(Board.class);

        Move1 move = new Move1();
        when(board.spacePlayed("1", player)).thenReturn(true);

        assertTrue(move.play(board, player));
    }
}
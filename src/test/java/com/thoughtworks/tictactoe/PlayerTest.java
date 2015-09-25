package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

/**
 * Created by bpaff on 9/24/15.
 */
public class PlayerTest {

    private Player player;
    private PlayerInputReader input;
    private Map<String, Move> moves;
    private Move move;
    private Move move6;
    private String playerIdentifier;
    private Board board;

    @Before
    public void init()
    {
        moves = new HashMap<String, Move>();
        input = mock(PlayerInputReader.class);
        move = mock(Move.class);
        move6 = mock(Move.class);
        moves.put("1", move);
        moves.put("6", move6);
        playerIdentifier = "X";
        board = mock(Board.class);
        player = new Player(input, moves, playerIdentifier, board);
    }

    @Test
    public void shouldPromptPlayerForAMove() throws IOException {

        when(input.readPlayerInput()).thenReturn("1");
        player.getAndPlayMove();

        verify(input).readPlayerInput();

    }

    @Test
    public void shouldSelectMoveAfterPlayerSelection() throws IOException {
        when(input.readPlayerInput()).thenReturn("1");
        player.getAndPlayMove();

        verify(move).play(board, playerIdentifier);
    }

    @Test
    public void shouldSelectMoveSixAfterPlayerSelectsSix(){
        when(input.readPlayerInput()).thenReturn("6");
        player.getAndPlayMove();

        verify(move6).play(board, playerIdentifier);
    }

    @Test
    public void shouldReturnFalseWhenSelectedMoveIsAlreadyOccupied(){
        when(move.play(board, "X")).thenReturn(false);
        when(input.readPlayerInput()).thenReturn("6");


        assertFalse(player.getAndPlayMove());

    }

}
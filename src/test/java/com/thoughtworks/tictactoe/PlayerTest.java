package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

import static org.mockito.Mockito.*;

/**
 * Created by bpaff on 9/24/15.
 */
public class PlayerTest {

    private Player player;
    private PlayerInputReader input;
    private Map<String, Move> moves;

    @Before
    public void init()
    {
        moves = mock(Map.class);
        input = mock(PlayerInputReader.class);
        moves.put("1", new Move1());
        player = new Player(input, moves);
    }

    @Test
    public void shouldPromptPlayerForAMove() throws IOException {

        when(input.readPlayerInput()).thenReturn("1");
        player.getMove();

        verify(input).readPlayerInput();

    }

    @Test
    public void shouldSelectMoveAfterPlayerSelection() throws IOException {
        when(input.readPlayerInput()).thenReturn("1");
        player.getMove();

        verify(moves).get(1);
    }

}
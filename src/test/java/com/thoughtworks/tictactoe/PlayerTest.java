package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

import static org.mockito.Mockito.*;

/**
 * Created by bpaff on 9/24/15.
 */
public class PlayerTest {

    private Player player;
    private BufferedReader input;
    private Map<String, Move> moves;

    @Before
    public void init()
    {
        moves = mock(Map.class);
        input = mock(BufferedReader.class);
        player = new Player(input, moves);
    }

    @Test
    public void shouldPromptPlayerForAMove() throws IOException {
        player.getMove();

        verify(input).readLine();

    }

    @Test
    @Ignore
    public void shouldSelectMoveAfterPlayerSelection() throws IOException {
        when(input.readLine()).thenReturn("1");
        player.getMove();

        verify(moves).get(1);
    }

}
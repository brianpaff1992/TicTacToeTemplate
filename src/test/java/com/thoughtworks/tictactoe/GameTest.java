package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by bpaff on 9/24/15.
 */
public class GameTest {

    private PrintStream printStream;
    private Game game;

    @Before
    public void init()
    {
       printStream = mock(PrintStream.class);
        game = new Game(printStream);
    }

    @Test
    public void shouldPrintOutBoardWhenStarted()
    {
        game.print();

        verify(printStream).println(" | | \n-----\n | | \n-----\n | | ");
    }

    @Test
    public void shouldPrintPlayer1SelectMoveMessageAfterGameStarted(){
        game.start();

        verify(printStream).println(contains("select a move"));
    }

}
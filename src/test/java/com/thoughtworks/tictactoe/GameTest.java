package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Ignore;
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
    private Player player1;
    private Player player2;
    private Board board;

    @Before
    public void init()
    {
       printStream = mock(PrintStream.class);
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        board = mock(Board.class);
        game = new Game(printStream, player1, player2,board);
    }

    @Test
    public void shouldPrintOutBoardWhenStarted()
    {
        game.print();

        verify(board).printBoard();
    }

    @Test
    public void shouldPrintPlayer1SelectMoveMessageAfterGameStarted(){
        game.start();

        verify(printStream).println(contains("select a move"));
    }

    @Test
    @Ignore
    public void shouldPrintXInTopRightCornerWhenPlayerSelectsOne(){

        game.playGame();

        verify(printStream).println("X| | \n-----\n | | \n-----\n | | ");
    }

}
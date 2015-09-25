package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

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
        when(player1.getAndPlayMove()).thenReturn(true);
        when(player2.getAndPlayMove()).thenReturn(true);
        when(board.isFull()).thenReturn(false, true);
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

        verify(printStream).println(contains("Player 1"));
    }

    @Test
    public void shouldGetPlayer1MoveAfterPromptMessage(){
        game.start();

        verify(player1).getAndPlayMove();
    }

    @Test
    public void shouldPrintPlayer2SelectMoveMessageAfterGameStarted(){
        game.start();

        verify(printStream).println(contains("Player 2"));
    }


    @Test
    public void shouldGetPlayer2MoveAfterPromptMessage(){
        game.start();

        verify(player2).getAndPlayMove();
    }

    @Test
    @Ignore
    //Fix this test
    public void shouldMakePlayerReSelectOptionIfMoveIsTaken(){
        when(player1.getAndPlayMove()).thenReturn(false, true);
        when(player2.getAndPlayMove()).thenReturn(false, true);
        game.playGame();

        verify(printStream).println(contains("Location already taken"));
    }

    @Test
    public void shouldQuitGameIfGameIsDone(){
        when(board.isFull()).thenReturn(true);

        game.playGame();

        verify(printStream).println(contains("Game is a draw"));
    }

}
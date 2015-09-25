package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Created by bpaff on 9/24/15.
 */
public class BoardTest {
    private Board board;
    private int numberOfSpaces;
    private Row row1;
    private Row row2;
    private Row row3;
    private PrintStream printStream;

    @Before
    public void init(){
        Map<String, Space> spaces = new HashMap<>();
        numberOfSpaces = 9;
        row1 = mock(Row.class);
        row2 = mock(Row.class);
        row3 = mock(Row.class);
        printStream = mock(PrintStream.class);
        board = new Board(row1,row2,row3,printStream);
    }

    @Test
    public void shouldFormatAllThreeRowsWhenPrintingBoard(){
        board.printBoard();

        verify(row1).format();
        verify(row2).format();
        verify(row3).format();
    }

    @Test
    public void shouldPrintDashesBetweenRows(){
        when(row1.format()).thenReturn(" | | ");
        when(row2.format()).thenReturn(" | | ");
        when(row3.format()).thenReturn(" | | ");
        board.printBoard();

        verify(printStream).println(" | | \n-----\n | | \n-----\n | | ");
    }

    @Test
    public void shouldMarkCorrectRowsAsHavingATakenSpaceWhenMoveIsSelected(){
        when(row1.has("1")).thenReturn(true);
        board.spacePlayed("1", "X");

        verify(row1).spaceTaken("1", "X");
    }

    @Test
    public void shouldPrintXInTopRightCornerWhenPlayerSelectsOne(){

        when(row1.format()).thenReturn("X| | ");
        when(row2.format()).thenReturn(" | | ");
        when(row3.format()).thenReturn(" | | ");
        board.printBoard();

        verify(printStream).println("X| | \n-----\n | | \n-----\n | | ");
    }

    @Test
    public void shouldReturnFalseWhenMoveNotPlaced(){
        String space = "1";
        String player = "X";
        when(row1.has(space)).thenReturn(true);
        when(row1.spaceTaken(space, player)).thenReturn(false);

        assertFalse(board.spacePlayed(space, player));
    }

    @Test
    public void shouldReturnTrueWhenMoveNotPlaced(){
        String space = "1";
        String player = "X";
        when(row1.has(space)).thenReturn(true);
        when(row1.spaceTaken(space, player)).thenReturn(true);

        assertTrue(board.spacePlayed(space, player));
    }

    @Test
    public void shouldReturnBoardIsFullIfAllRowsAreFull(){
        when(row1.isFull()).thenReturn(true);
        when(row2.isFull()).thenReturn(true);
        when(row3.isFull()).thenReturn(true);

        assertTrue(board.isFull());
    }

    @Test
    public void shouldReturnBoardIsNotFullWhenOneRowIsNotFull(){
        when(row1.isFull()).thenReturn(false);
        when(row2.isFull()).thenReturn(true);
        when(row3.isFull()).thenReturn(true);

        assertFalse(board.isFull());
    }

}
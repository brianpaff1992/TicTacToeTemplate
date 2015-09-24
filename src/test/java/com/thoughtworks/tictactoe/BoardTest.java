package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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



}
package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by bpaff on 9/24/15.
 */
public class RowTest {

    private Space left;
    private Space center;
    private Space right;
    private String player;
    private Row row;

    @Before
    public void init(){
        left = mock(Space.class);
        center = mock(Space.class);
        right = mock(Space.class);
        row = new Row(left, center, right);
        player = "X";
    }

    @Test
    public void shouldMarkLeftAsTakenWhenLeftSelected(){
        row.take("left", player);

        verify(left).take(player);
    }

    @Test
    public void shouldMarkCenterAsTakenWhenCenterSelected(){
        row.take("center", player);

        verify(center).take(player);
    }

    @Test
    public void shouldMarkRightAsTakenWhenRightSelected(){
        row.take("right", player);

        verify(right).take(player);
    }

    @Test
    public void shouldGetAllSpaces(){
        row.format();

        verify(left).getSpace();
        verify(center).getSpace();
        verify(right).getSpace();
    }

    @Test
    public void shouldFormatIntoATicTacToeRow(){
        when(left.getSpace()).thenReturn(" ");
        when(center.getSpace()).thenReturn(" ");
        when(right.getSpace()).thenReturn(" ");
        String formattedRow = row.format();

        assertEquals(" | | ", formattedRow);
    }

    @Test
    public void shouldHaveSpaceWhenSpaceIsInRow(){
        when(left.is("1")).thenReturn(true);

        boolean bool = row.has("1");

        assertTrue(bool);
    }

    @Test
    public void shouldReturnFalseWhenMoveWasNotTaken(){
        String space = "1";
        when(left.is(space)).thenReturn(true);
        when(left.take(player)).thenReturn(false);

        assertFalse(row.spaceTaken(space, player));
    }

    @Test
    public void shouldReturnTrueWhenMoveWasTaken(){
        String space = "1";
        when(left.is(space)).thenReturn(true);
        when(left.take(player)).thenReturn(true);

        assertTrue(row.spaceTaken(space, player));
    }

    @Test
    public void shouldReturnFullWhenAllSpacesTaken(){
        when(left.isTaken()).thenReturn(true);
        when(center.isTaken()).thenReturn(true);
        when(right.isTaken()).thenReturn(true);

        assertTrue(row.isFull());
    }

    @Test
    public void shouldReturnNotFullWhenNotAllSpacesTaken(){
        when(left.isTaken()).thenReturn(false);
        when(center.isTaken()).thenReturn(true);
        when(right.isTaken()).thenReturn(true);

        assertFalse(row.isFull());
    }

    @Test
    public void shouldReturnTrueIfAllThreeSpacesHaveMatchingPlayer(){
        when(left.isTaken()).thenReturn(true);
        when(center.isTaken()).thenReturn(true);
        when(right.isTaken()).thenReturn(true);
        when(left.getSpace()).thenReturn("X");
        when(center.getSpace()).thenReturn("X");
        when(right.getSpace()).thenReturn("X");

        assertTrue(row.hasWinner());
    }

    @Test
    public void shouldReturnFalseIfAllThreeSpacesDontHaveMatchingPlayer(){
        when(left.isTaken()).thenReturn(true);
        when(center.isTaken()).thenReturn(true);
        when(right.isTaken()).thenReturn(true);
        when(left.getSpace()).thenReturn("X");
        when(center.getSpace()).thenReturn("X");
        when(right.getSpace()).thenReturn("O");

        assertFalse(row.hasWinner());
    }

    @Test
    public void shouldReturnFalseIfAnySpaceIsntTake(){
        when(left.isTaken()).thenReturn(true);
        when(center.isTaken()).thenReturn(false);
        when(right.isTaken()).thenReturn(true);

        assertFalse(row.hasWinner());
    }
}
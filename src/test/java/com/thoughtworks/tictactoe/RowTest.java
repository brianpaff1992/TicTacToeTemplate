package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by bpaff on 9/24/15.
 */
public class RowTest {

    private Space left;
    private Space center;
    private Space right;
    private Player player;
    private Row row;

    @Before
    public void init(){
        left = mock(Space.class);
        center = mock(Space.class);
        right = mock(Space.class);
        row = new Row(left, center, right);
        player = mock(Player.class);
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

}
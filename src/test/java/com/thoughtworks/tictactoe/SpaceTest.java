package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bpaff on 9/24/15.
 */
public class SpaceTest {

    private Space space;
    private String player;

    @Before
    public void init(){
        space = new Space();
        player = "X";
    }

    @Test
    public void shouldReturnPlayerWhoHasTakenSpace(){
        space.take(player);

        assertEquals(player, space.getSpace());
    }

}
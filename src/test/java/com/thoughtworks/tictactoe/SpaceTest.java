package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by bpaff on 9/24/15.
 */
public class SpaceTest {

    private Space space;
    private String player;

    @Before
    public void init(){
        space = new Space("1");
        player = "X";
    }

    @Test
    public void shouldReturnPlayerWhoHasTakenSpace(){
        space.take(player);

        assertEquals(player, space.getSpace());
    }

    @Test
    public void shouldDetectIfSpaceIsNotTaken(){
        assertFalse(space.isTaken());
    }

    @Test
    public void shouldDetectIfSpaceIsTaken() {
        space.take("X");

        assertTrue(space.isTaken());
    }

    @Test
    public void shouldReturnFalseIfSpaceHasAlreadyBeenTaken(){
        space.take("O");
        assertFalse(space.take("X"));
    }

    @Test
    public void shouldReturnTrueIfSpaceHasntBeenTaken(){
        assertTrue(space.take("x"));
    }

}
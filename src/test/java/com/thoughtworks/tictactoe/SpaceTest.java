package com.thoughtworks.tictactoe;

import org.junit.Before;

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

}
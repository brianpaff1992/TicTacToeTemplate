package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by bpaff on 9/24/15.
 */
public class BoardTest {
    private Board board;
    private int numberOfSpaces;

    @Before
    public void init(){
        ArrayList<Space> spaces = new ArrayList<>();
        numberOfSpaces = 9;
        board = new Board(spaces, numberOfSpaces);
    }

    @Test
    public void shouldCreateSameNumberOfSpacesAsGiven(){
        board.create();


    }

}
package com.thoughtworks.tictactoe;

import org.junit.Before;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bpaff on 9/24/15.
 */
public class BoardTest {
    private Board board;
    private int numberOfSpaces;

    @Before
    public void init(){
        Map<String, Space> spaces = new HashMap<>();
        numberOfSpaces = 9;
        board = new Board(spaces, numberOfSpaces);
    }

}
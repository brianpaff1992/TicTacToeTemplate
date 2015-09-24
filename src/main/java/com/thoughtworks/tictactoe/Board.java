package com.thoughtworks.tictactoe;

import java.util.Map;

/**
 * Created by bpaff on 9/24/15.
 */
public class Board {

    private Map<String,Space> spaces;
    private int numberOfSpaces;

    public Board(Map<String, Space> spaces, int numberOfSpaces){
        this.spaces = spaces;
        this.numberOfSpaces = numberOfSpaces;
    }

    public void print()
    {
       //
    }

    public void spacePlayed(String space, String player)
    {

    }
}

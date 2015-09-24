package com.thoughtworks.tictactoe;

import java.util.ArrayList;

/**
 * Created by bpaff on 9/24/15.
 */
public class Board {

    ArrayList<Space> spaces;
    int numberOfSpaces;
    public Board(){
        spaces = new ArrayList<Space>();
        numberOfSpaces = 9;
    }

    public void create()
    {
        for(int i =0; i< numberOfSpaces; i++)
        {
            spaces.add(new Space());
        }
    }

    public void print()
    {

    }
}

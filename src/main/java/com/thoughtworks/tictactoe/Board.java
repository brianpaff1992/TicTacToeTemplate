package com.thoughtworks.tictactoe;

import java.util.ArrayList;

/**
 * Created by bpaff on 9/24/15.
 */
public class Board {

    ArrayList<Space> spaces;
    int numberOfSpaces;

    public Board(ArrayList<Space> spaces, int numberOfSpaces){
        this.spaces = spaces;
        this.numberOfSpaces = numberOfSpaces;
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
//        String board = "";
//        for(int i = 0; i< numberOfSpaces; i++)
//        {
//            if(i %2 == 0 || i%3)
//        }
    }
}

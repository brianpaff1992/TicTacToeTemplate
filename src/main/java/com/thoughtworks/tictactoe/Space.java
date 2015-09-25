package com.thoughtworks.tictactoe;

/**
 * Created by bpaff on 9/24/15.
 */
public class Space {
    private String space;
    private String spaceNumber;

    public Space(String spaceNumber)
    {
        space = " ";
        this.spaceNumber = spaceNumber;
    }

    public String getSpace(){
        return space;
    }

    public void take(String player) {
        space = player;
    }

    public boolean is(String space) {
        return space.equals(spaceNumber);
    }
}

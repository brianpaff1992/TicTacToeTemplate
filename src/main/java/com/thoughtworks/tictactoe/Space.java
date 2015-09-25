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

    public boolean take(String player) {
        if(space.equals(" "))
        {
            space = player;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean is(String space) {
        return space.equals(spaceNumber);
    }

    public boolean isTaken() {
        if(space.equals(" "))
        {
            return false;
        }
        else{
            return true;
        }
    }
}

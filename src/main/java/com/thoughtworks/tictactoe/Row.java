package com.thoughtworks.tictactoe;

/**
 * Created by bpaff on 9/24/15.
 */
public class Row {
    Space leftSpace;
    Space centerSpace;
    Space rightSpace;

    public Row(Space leftSpace, Space centerSpace, Space rightSpace)
    {
        this.leftSpace = leftSpace;
        this.centerSpace = centerSpace;
        this.rightSpace = rightSpace;
    }

    public void take(String space, String player) {
        if(space.equals("left"))
        {
            leftSpace.take(player);
        }
        else if(space.equals("center"))
        {
            centerSpace.take(player);
        }
        else
        {
            rightSpace.take(player);
        }
    }

    public String format() {
        return leftSpace.getSpace() + "|" + centerSpace.getSpace() + "|" + rightSpace.getSpace();
    }

    public boolean spaceTaken(String space, String player) {
        if(leftSpace.is(space))
        {
            return leftSpace.take(player);
        }
        else if (centerSpace.is(space))
        {
            return centerSpace.take(player);
        }
        else
        {
            return rightSpace.take(player);
        }
    }

    public boolean has(String space) {
        if(leftSpace.is(space) || centerSpace.is(space) || rightSpace.is(space))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isFull() {
        if(leftSpace.isTaken() && centerSpace.isTaken() && rightSpace.isTaken())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

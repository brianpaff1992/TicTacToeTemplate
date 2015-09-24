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

    public void take(String space, Player player) {
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
}

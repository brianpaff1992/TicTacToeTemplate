package com.thoughtworks.tictactoe;

/**
 * Created by bpaff on 9/24/15.
 */
public class Board {

    private Row row1;
    private Row row2;
    private Row row3;
    private int numberOfSpaces;

    public Board(Row row1, Row row2, Row row3, int numberOfSpaces){
        this.row1 = row1;
        this.row2 = row2;
        this.row3 = row3;
        this.numberOfSpaces = numberOfSpaces;
    }

    public void print()
    {
       //
    }

    public void determineRow(String space)
    {

    }

    public void spacePlayed(String space, String player)
    {

    }
}

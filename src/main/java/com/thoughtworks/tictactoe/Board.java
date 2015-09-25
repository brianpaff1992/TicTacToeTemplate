package com.thoughtworks.tictactoe;

import java.io.PrintStream;

/**
 * Created by bpaff on 9/24/15.
 */
public class Board {

    private Row row1;
    private Row row2;
    private Row row3;
    private int numberOfSpaces;
    private PrintStream printStream;

    public Board(Row row1, Row row2, Row row3, PrintStream printStream){
        this.row1 = row1;
        this.row2 = row2;
        this.row3 = row3;
        //this.numberOfSpaces = numberOfSpaces;
        this.printStream = printStream;
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
        //figureOutWhatRowItGoesInto
        if(row1.has(space))
        {
            row1.spaceTaken(space);
        }
        else if (row2.has(space))
        {
            row2.spaceTaken(space);
        }
        else{
            row3.spaceTaken(space);
        }

    }

    public void printBoard() {
        String board = "";
        board = board + row1.format();
        board = board + "\n-----\n";
        board = board + row2.format();
        board = board + "\n-----\n";
        board = board + row3.format();

        printStream.println(board);
    }
}

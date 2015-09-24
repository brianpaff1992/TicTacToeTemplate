package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by bpaff on 9/24/15.
 */
public class PlayerInputReader {

    private BufferedReader reader;

    public PlayerInputReader(BufferedReader reader)
    {

        this.reader = reader;
    }

    public String readPlayerInput(){
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}

package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

/**
 * Created by bpaff on 9/24/15.
 */
public class Player {

    private BufferedReader reader;
    private Map<String, Move> moves;

    public Player(BufferedReader reader, Map<String, Move> moves)
    {
        this.reader = reader;
        this.moves = moves;
    }

    public void getMove() {
        String userInput = readPlayerInput();

        //moves.get(userInput).play();
    }

    private String readPlayerInput() {
        String userInput = "";
        try {
            userInput = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userInput;
    }
}

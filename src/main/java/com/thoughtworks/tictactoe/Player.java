package com.thoughtworks.tictactoe;

import java.util.Map;

/**
 * Created by bpaff on 9/24/15.
 */
public class Player {

    private PlayerInputReader reader;
    private Map<String, Move> moves;
    private String player;

    public Player(PlayerInputReader reader, Map<String, Move> moves, String player)
    {
        this.reader = reader;
        this.moves = moves;
        this.player = player;
    }

    public void getMove() {
        String userInput = reader.readPlayerInput();

        Move move = moves.get(userInput);
        move.play(player);
    }

}

package com.thoughtworks.tictactoe;

import java.util.Map;

/**
 * Created by bpaff on 9/24/15.
 */
public class Player {

    private PlayerInputReader reader;
    private Map<String, Move> moves;
    private String player;
    private Board board;

    public Player(PlayerInputReader reader, Map<String, Move> moves, String player, Board board)
    {
        this.reader = reader;
        this.moves = moves;
        this.player = player;
        this.board = board;
    }

    public boolean getAndPlayMove() {

        String userInput = reader.readPlayerInput();
        Move move = moves.get(userInput);
        return move.play(board, player);
    }

    @Override
    public boolean equals(Object player)
    {
        Player p = (Player) player;
        if(p.getPlayer().equals(this.player))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public String getPlayer() {
        return player;
    }

}

package com.contestantbots.bots;

import com.contestantbots.framework.Commander;
import com.contestantbots.framework.ContestantBotImplementation;
import com.contestantbots.framework.GameState;
import com.contestantbots.framework.*;
import com.scottlogic.hackathon.game.*;

public class ThanOS extends ContestantBotImplementation {

    

    public ThanOS() { super("ThanOS"); }


    public void getReady(GameState gameState) {}

    public void issueCommands(GameState gameState, Commander commander) {
        for (Unit unit : gameState.getMyUnits()) {
            commander.issueMoveOrder(unit, Direction.NORTH);
        }
    }
}

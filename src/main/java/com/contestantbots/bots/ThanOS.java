package com.contestantbots.bots;

import com.contestantbots.framework.Commander;
import com.contestantbots.framework.ContestantBotImplementation;
import com.contestantbots.framework.GameState;

public class ThanOS extends ContestantBotImplementation {

    public star(int currentX, int currentY, int targetX, int targetY){
        List openList = new ArrayList();
        List closedList = new ArrayList();
        Node startNode = new Node(currentX, currentY);

        openList.add(startNode);

        while(!openList.isEmpty()){
            Node q = new Node(0,0);
            q.setF(100000);
            for(Node nd : openList){
                if(nd.getF < q.getF)
                    q = nd;
            }
            
        }
    }

    public ThanOS() { super("ThanOS"); }

    public void getReady(GameState gameState) {}

    public void issueCommands(GameState gameState, Commander commander) {}
}

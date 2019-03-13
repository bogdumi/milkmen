package com.contestantbots.bots;

import com.contestantbots.framework.Commander;
import com.contestantbots.framework.ContestantBotImplementation;
import com.contestantbots.framework.GameState;
import com.contestantbots.framework.Node;
import com.scottlogic.hackathon.game.Direction;
import com.scottlogic.hackathon.game.Position;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;

int f-matrix[100][100];

public class ThanOS extends ContestantBotImplementation {

    public void star(Position currentPos, Position targetPos){
        List<Node> openList = new ArrayList();
        List<Node> closedList = new ArrayList();
        Node startNode = new Node();
        startNode.setPos(currentPos);

        openList.add(startNode);

        while(!openList.isEmpty()){

            Node q = new Node();
            q.setF(100000);
            
            for(Node nd : openList){
                if(nd.getF() < q.getF())
                    q = nd;
            }

            List<Node> succ = q.genSucc();

            for(Node nd : succ){
                if(nd.getPos() == targetPos)
                    return;
                nd.calcF(targetPos);
                
            }
        }
    }

    public ThanOS() { super("ThanOS"); }

    public void getReady(GameState gameState) {

    }

    public void issueCommands(GameState gameState, Commander commander) {
        
    }
}

package com.contestantbots.framework;
import com.contestantbots.framework.Commander;
import com.contestantbots.framework.ContestantBotImplementation;
import com.contestantbots.framework.GameState;
import com.scottlogic.hackathon.game.Position;
import java.lang.*;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;

public class Node {
    Position pos;
    Node parent;
    int f,g,h;

    public Node (){
        this.f = 0;
    }

    public List<Node> genSucc(){
        List<Node> res = new ArrayList();
        Node aux = new Node();
        aux.setParent(this);

        Position auxpos1 = new Position(this.getPos().getX()-1, this.getPos().getY()-1);
        aux.setPos(auxpos1);
        res.add(aux);

        Position auxpos2 = new Position(this.getPos().getX()-1, this.getPos().getY());
        aux.setPos(auxpos2);
        res.add(aux);

        Position auxpos3 = new Position(this.getPos().getX()-1, this.getPos().getY()+1);
        aux.setPos(auxpos3);
        res.add(aux);

        Position auxpos4 = new Position(this.getPos().getX(), this.getPos().getY()-1);
        aux.setPos(auxpos4);
        res.add(aux);

        Position auxpos5 = new Position(this.getPos().getX(), this.getPos().getY()+1);
        aux.setPos(auxpos5);
        res.add(aux);

        Position auxpos6 = new Position(this.getPos().getX()+1, this.getPos().getY()-1);
        aux.setPos(auxpos6);
        res.add(aux);

        Position auxpos7 = new Position(this.getPos().getX()+1, this.getPos().getY());
        aux.setPos(auxpos7);
        res.add(aux);

        Position auxpos8 = new Position(this.getPos().getX()+1, this.getPos().getY()+1);
        aux.setPos(auxpos8);
        res.add(aux);

        return res;
    }

    public void setPos(Position pos){
        this.pos = pos;
    }

    public Position getPos(){
        return this.pos;
    }

    public void setParent(Node nd){
        this.parent = nd;
    }

    public Node getParent(){
        return this.parent;
    }

    public void calcF(Position target){
        this.calcG();
        this.calcH(target);
        this.f = this.g + this.h;
    }

    public void calcG(){
        this.g = this.parent.g + 1;
    }

    public void calcH(Position target){
        this.h = Math.max(Math.abs(this.pos.getX() - target.getX()), Math.abs(this.pos.getY() - target.getY()));
    }

    public void setF(int f){
        this.f = f;
    }

    public void setG(int g){
        this.g = g;
    }

    public void setH(int h){
        this.h = h;
    }

    public int getF(){
        return this.f;
    }

    public int getG(){
        return this.g;
    }

    public int getH(){
        return this.h;
    }

}
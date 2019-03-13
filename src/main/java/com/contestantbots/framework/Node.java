package com.contestantbots.framework;

public class Node {
    int x,y;
    int f,g,h;

    public Node (int x, int y){
        this.x = x;
        this.y = y;
        this.f = 0;
    }

    public calcF(){

    }

    public calcG(){

    }

    public calcH(){

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
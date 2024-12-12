package com.enigmacamp.robot;

public class Position {
    private Integer cordinateX;
    private Integer cordinateY;

    public Position(Integer cordinateX, Integer cordinateY) {
        this.cordinateX = cordinateX;
        this.cordinateY = cordinateY;
    }

    public void getRight(){
        this.cordinateX +=1;
    }

    public void getLeft(){
        this.cordinateX -=1;
    }

    public void getTop(){
        this.cordinateY +=1;
    }


    public void getBottom(){
        this.cordinateY -=1;
    }

    @Override
    public String toString() {
        return "Position{" +
                "cordinateX=" + cordinateX +
                ", cordinateY=" + cordinateY +
                '}';
    }

}

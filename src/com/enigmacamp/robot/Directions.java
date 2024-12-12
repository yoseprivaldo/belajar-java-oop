package com.enigmacamp.robot;

public enum Directions {
    NORTH, //0  N ->W = 3
    EAST,  // 1
    SOUTH, // 2
    WEST; // 3

    // ordinal adalah index dari instance enum
    public Directions turnRight(){
        return values()[(ordinal()+1)%4];
    };

    public Directions turnLeft(){
        return values()[(ordinal()+3)%4];
    }

    public int getOrdinal(){
        return ordinal();
    }

}

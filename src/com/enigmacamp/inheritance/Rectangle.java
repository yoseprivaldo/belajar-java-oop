package com.enigmacamp.inheritance;

public class Rectangle {
    Double length;
    Double width;
    Double pi = 3.14;

    Rectangle (Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    Double getSurface(){
        return length * width;
    }

    Double getRound(){
        return 2 * (length + width);
    }

}

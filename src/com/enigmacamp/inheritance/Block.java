package com.enigmacamp.inheritance;

public class Block {
    Double length;
    Double width;
    Double height;

    Block (Double length, Double width, Double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Luas
    Double getSurface() {
        return  2 * (
                    this.length * this.width +
                    this.length * this.height +
                    this.width * this.height
                );
    }

    // Keliling
    Double getRound() {
        return 2 * (this.length * this.width + this.height);
    }

    // Volume
    Double getVolume(){
        return this.length * this.width * this.height;
    }
}

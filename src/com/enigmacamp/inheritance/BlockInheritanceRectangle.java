package com.enigmacamp.inheritance;

public class BlockInheritanceRectangle extends Rectangle{
    Double height;
    Integer age = 10;

    BlockInheritanceRectangle(Double length, Double width, Double height){
        super(length, width);
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

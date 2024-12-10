package com.enigmacamp.encapsulation;

public class Car {
    private String colour;
    private Boolean isStart;
    private Integer fuel;

    public Car(String colour, Boolean isStart, Integer fuel) {
        this.colour = colour;
        this.isStart = isStart;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", isStart=" + isStart +
                ", fuel=" + fuel +
                '}';
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Boolean getStart() {
        return isStart;
    }

    public void setStart(Boolean start) {
        isStart = start;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }
}

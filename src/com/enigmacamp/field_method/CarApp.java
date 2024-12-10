package com.enigmacamp.field_method;

public class CarApp {
    public static void main(String[] args) {
        var terios = new Car();

        terios.colour = "Blue";
        terios.isEngineOn = false;
        terios.fuel = 100;

        System.out.println(terios.colour);
        System.out.println(terios.isEngineOn);
        System.out.println(terios.fuel);

        System.out.println(terios.engineStart());
        System.out.println(terios.isEngineOn);

    }
}

package com.enigmacamp.constructor_method;

public class CarApp {
    public static void main(String[] args) {

        var terios = new Car("Terios", "Blue", true, 90, "Electric");
//        terios.name = "Terios";
//        terios.colour = "Blue";
//        terios.isEngineOn = true;
//        terios.fuel = 90;
//        terios.engineType = "Electic";

        terios.printObj();
    }

}

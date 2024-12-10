package com.enigmacamp.constructor_method;

public class Car {
    String name;
    String colour;
    Boolean isEngineOn;
    Integer fuel;
    String engineType;


    public Car(String name, String colour, Boolean isEngineOn, Integer fuel, String engineType) {
        this.name = name;
        this.colour = colour;
        this.isEngineOn = isEngineOn;
        this.fuel = fuel;
        this.engineType = engineType;
    }

    String engineStart(){
        if(fuel > 0) {
            isEngineOn = true;
            return "BRUM BRUM";
        } else {
            return "Bahan bakar tidak ada bro";
        }
    }

    void printObj (){
        System.out.println("Car Information");
        System.out.println("Name        : " + name);
        System.out.println("Colour      : " + colour);
        System.out.println("isEngineOn  : " + isEngineOn);
        System.out.println("Fuel        : " + fuel );
        System.out.println("EngineType  : " + engineType);
    }
}


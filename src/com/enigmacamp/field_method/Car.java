package com.enigmacamp.field_method;

public class Car {
    String colour;
    Boolean isEngineOn;
    Integer fuel;
    final String BRAND = "Daihatsu";

    String engineStart(){
        if(fuel > 0) {
            isEngineOn = true;
            return "BRUM BRUM";
        } else {
            return "Bahan bakar tidak ada bro";
        }
    }
}


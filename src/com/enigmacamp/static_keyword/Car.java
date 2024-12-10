package com.enigmacamp.static_keyword;

public class Car {
    static String colour;
    static Boolean isEngineOn;
    static Integer fuel;
    static String brand;
    static Integer odometer= 0;


    static String engineStart(){
        if(fuel > 0) {
            isEngineOn = true;
            odometer += 10;
            return "BRUM BRUM";
        } else {
            return "Bahan bakar tidak ada bro";
        }
    }

    static {
        brand = "DAIHATSU";
        System.out.println("HELLO");
    }

    // Nested Class Engine
     class Engine{
        String engineType = "Electrical";

        public void main(String[] args) {
            System.out.println("Engine Type: " + engineType);
        }

        public void showEngineType (){
            System.out.println(engineType);
        }
    }

}

// Static
// Management Memory
// Static -> {Variable, method, block, dan nested class}
// Depends on class not object
// Cannot access non-static members

package com.enigmacamp.static_keyword;

public class CarApp {
    public static void main(String[] args) {
//        var terios = new Car();
//
//        terios.colour = "Blue";
//        terios.isEngineOn = false;
//        terios.fuel = 100;
//        System.out.println(terios.engineStart());
//
//        System.out.println(terios.colour);
//        System.out.println(terios.isEngineOn);
//        System.out.println(terios.fuel);
//
//        var ayla = new Car();
//        ayla.colour = "Red";
//        ayla.fuel = 100;
//        ayla.isEngineOn = false;
//
//        System.out.println("Terios Brand : " + terios.brand);
//        System.out.println("Ayla Brand: "  + ayla.brand);
//        terios.brand = "Honda";
//        System.out.println("Terios Brand : " + terios.brand);
//        System.out.println("Ayla Brand: "  + ayla.brand);

//   var engine = new Car.Engine();
//   engine.showEngineType();

        var engine = new Car();
        var engineNested = engine.new Engine();
    }
}

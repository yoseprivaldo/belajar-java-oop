package com.enigmacamp.this_keyword;

public class CarApp {
    public static void main(String[] args) {

        var engine = new Car("Honda", 90);
//        engine.name = "Daihatsu";
//        engine.fuel = 80;
        System.out.println(engine.name);
        System.out.println(engine.fuel);

        var yamaha = new Car("yamaha", 100);
        var jaguar = new Car("jaguar", 80);

        yamaha.showThis();
        jaguar.showThis();

        System.out.println(yamaha instanceof Car);
        yamaha.isTrue(jaguar);

    }
}

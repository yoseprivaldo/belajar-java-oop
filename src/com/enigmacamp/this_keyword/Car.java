package com.enigmacamp.this_keyword;

public class Car {
   String name;
   Integer fuel;

    void viewCarSpec (){
         name = "Brio";
         fuel = 80;
        System.out.println("Car Name: " + name + ", Fuel" + fuel);
        {
            String company = "PT Humanian";
            System.out.println(company);
        }
    }

    // Variable Shadowing
//    Car (String name, Integer fuel) {
//        name = name;
//        fuel = fuel;
//    }

    Car (String name, Integer fuel) {
        this.name = name;
        this.fuel = fuel;
    }

    // merepresentasikan this
    void showThis (){
        System.out.println(this);
    }

    void isTrue (Object obj) {
        if( this == obj) {
            System.out.println("Benar");
        } else {
            System.out.println("Salah");
        }
    }

}



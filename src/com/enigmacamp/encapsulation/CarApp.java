package com.enigmacamp.encapsulation;

public class CarApp {

    public static void main(String[] args) {

        var toyota = new Car("Red", true, 90);

        System.out.println(toyota);

//        public String toString() {
//            return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
//        }

        Integer angka = 13;
        System.out.println(angka.toString());

        System.out.println(angka.getClass());
        System.out.println("sedang dijalankan");
        System.out.println(angka.getClass().getName() + "@" + Integer.toHexString(angka.hashCode()));
        System.out.println("sudah dijalankan");

    }

}

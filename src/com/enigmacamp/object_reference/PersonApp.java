package com.enigmacamp.object_reference;

public class PersonApp {
    public static void main(String[] args) {

        Person person1 = new Person("Udin", "24");
        Person person2 = person1;

        Person person3 = new Person("Udin", "24");

        person2.setName("Juls");

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());


    }
}

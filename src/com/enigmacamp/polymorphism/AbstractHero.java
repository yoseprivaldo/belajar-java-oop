package com.enigmacamp.polymorphism;

public abstract class AbstractHero implements SpecialAbility {

    abstract public void getHit(Integer damage);
    abstract public void attack(Hero hero);

    public void sayHello(String name){
        System.out.println("hello");
    }



}

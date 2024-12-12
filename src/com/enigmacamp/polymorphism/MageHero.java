package com.enigmacamp.polymorphism;

public class MageHero extends Hero{
    public MageHero(String name, Integer hp, Integer mana, Integer baseDamage, Integer attactSpeed) {
        super(name, hp, mana, baseDamage, attactSpeed);
        this.mana += 100;
    }

    public void sayHelloMage(){
        System.out.println("this is mage class");
    }


}

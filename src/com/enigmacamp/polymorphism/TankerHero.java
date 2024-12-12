package com.enigmacamp.polymorphism;

public class TankerHero extends Hero {
    public TankerHero(String name, Integer hp, Integer mana, Integer baseDamage, Integer attactSpeed) {
        super(name, hp, mana, baseDamage, attactSpeed);
        this.hp += 300;
    }



}

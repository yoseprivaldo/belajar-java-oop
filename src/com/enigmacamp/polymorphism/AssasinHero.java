package com.enigmacamp.polymorphism;

public class AssasinHero extends Hero{
    public AssasinHero(String name, Integer hp, Integer mana, Integer baseDamage, Integer attactSpeed) {
        super(name, hp, mana, baseDamage, attactSpeed);
        this.attactSpeed += 100;
    }

}

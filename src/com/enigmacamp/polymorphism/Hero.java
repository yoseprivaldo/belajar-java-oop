package com.enigmacamp.polymorphism;

public class Hero extends AbstractHero  {
    protected String name;
    protected Integer hp;
    protected Integer mana;
    protected Integer baseDamage;
    protected Integer attactSpeed;

    public String getName() {
        return name;
    }

    public void getHit(Integer damage){
        this.hp -= damage;
    }

    public void attack(Hero hero){
        hero.getHit(this.baseDamage);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mana=" + mana +
                ", baseDamage=" + baseDamage +
                ", attactSpeed=" + attactSpeed +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Integer getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(Integer baseDamage) {
        this.baseDamage = baseDamage;
    }

    public Integer getAttactSpeed() {
        return attactSpeed;
    }

    public void setAttactSpeed(Integer attactSpeed) {
        this.attactSpeed = attactSpeed;
    }

    public Hero(String name, Integer hp, Integer mana, Integer baseDamage, Integer attactSpeed) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.baseDamage = baseDamage;
        this.attactSpeed = attactSpeed;
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("useSpecialAbility");
        System.out.println(this.name);
    }
}

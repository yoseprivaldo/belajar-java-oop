package com.enigmacamp.polymorphism;

public class App {
    public static void main(String[] args) {

        // Instance Object Class
        TankerHero tank = new TankerHero("tank", 100, 100, 0,0);
        Hero assassin = new AssasinHero("gussion", 100, 100, 100, 100);
        Hero mage = new MageHero("Cyclops", 100, 100, 100, 0);

        MageHero hero1 = new MageHero("Hero1", 100, 100, 100,100);


        // UpCasting
        Hero nana = (Hero) tank;

//        // DownCasting
//        MageHero newMage = (MageHero) nana;
//        newMage.attack(assassin);

        ///  Cara lain
//        ((MageHero) nana).attack(tank);

        // Polymorhpysm
        System.out.println("Before Attack");
        System.out.println(tank);
        System.out.println(assassin);
        System.out.println(mage);

        // Polymorhysm memanggil method attack
        assassin.attack(mage);
        mage.attack(tank);
        tank.attack(assassin);
        tank.attack(mage);


        // After attack
        System.out.println("After Attactk");
        System.out.println(tank);
        System.out.println(assassin);
        System.out.println(mage);

        printHeroAssasin(tank);
        printHeroAssasin(assassin);
        printHeroAssasin(mage);

        tank.useSpecialAbility();

        hero1.sayHelloMage();


    }

    public static void printHeroAssasin(Hero hero){
        System.out.println(hero.name + "Status: " + hero.hp);
    }
}

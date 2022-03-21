package com.ansori.inpoli;


import com.ansori.inpoli.classes.*;

public class Main {
    public static void main(String[] args) {
        // polymorphism
        System.out.println("=========================");
        new Saber().getWeapon();
        new Lancer().getWeapon();
        new Assassin().getWeapon();

        // overloading constructor
        System.out.println("=========================");
        new Hero("Kamisato Ayaka").show();
        new Hero().show();
        new Hero("Kamisato Ayato").show();
        new Hero().show();
        new Hero().show();
        new Hero("Yae Miko").show();

        // overriding method
        System.out.println("=========================");
        System.out.println(new ReturnValue().returnValueOf("this is a text"));
        System.out.println(new ReturnValue().returnValueOf(12)+" is a number");
        System.out.println(new ReturnValue().returnValueOf(5.4f));

        System.out.println("=========================");
        new Bike("ontel","silver","M").show();
        System.out.println("=========================");
        new MountainBike("Polygon","Black metal","XL").show();
        System.out.println("=========================");
        new RoadBike("BMK","Light Red","X").show();
    }
}

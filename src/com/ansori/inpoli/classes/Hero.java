package com.ansori.inpoli.classes;

public class Hero {
    private final String name;
    private static int heroCount;

    public Hero(String name) {
        heroCount++;
        this.name = name;
    }

    public Hero() {
        heroCount++;
        this.name = "Hero "+Hero.heroCount;
    }

    public void show() {
        System.out.println("Name: "+this.name);
    }
}

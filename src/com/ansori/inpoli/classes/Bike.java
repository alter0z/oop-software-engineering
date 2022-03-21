package com.ansori.inpoli.classes;

public class Bike {
    private final String name;
    private final String color;
    private final String size;

    public Bike(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public void show() {
        System.out.println("name    : "+this.name);
        System.out.println("color   : "+this.color);
        System.out.println("size    : "+this.size);
    }
}

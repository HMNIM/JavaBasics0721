package com.javabasics.oops.abstraction;

public abstract class Bike {
    abstract void run();
    String color;

    public Bike(String color) {
        this.color = color;
    }
}

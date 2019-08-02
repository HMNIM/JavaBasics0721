package com.javabasics.oops.abstraction;

public class Yamaha extends Bike {
    String color;
    @Override
    void run() {
        System.out.println("Yamaha bikes runs fast");
    }

    public Yamaha(String color, String color1) {
        super(color);
        this.color = color1;
        System.out.println(color + " , "+  color1);
    }
}

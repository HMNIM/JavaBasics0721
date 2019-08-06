package com.javabasics.oops.abstraction;

public class DemoAbstarction {

    public static void main(String[] args) {
        Employee e = new Salary("Haritha", "Lincoln", 7777);
        e.mailCheck();
        e.pay();
    }
}

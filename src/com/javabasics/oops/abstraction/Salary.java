package com.javabasics.oops.abstraction;

public class Salary extends Employee {

    public Salary(String name, String address, int number) {
        super(name, address, number);
    }

    @Override
    public double pay() {
        System.out.println(50000);
        return 0.0;
    }
}

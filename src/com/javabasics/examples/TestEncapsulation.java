package com.javabasics.examples;

public class TestEncapsulation {
    public static void main(String[] args) {
        EncapsulationEmployee en = new EncapsulationEmployee();
        en.setId(4);
        en.setName("test");
        en.setSalary(6000);
        System.out.println( en.getName() + " " +en.getId() + " " +en.getSalary());
    }
}

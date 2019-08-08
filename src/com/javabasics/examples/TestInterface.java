package com.javabasics.examples;

public class TestInterface implements InterfaceExample {
    @Override
    public void display() {
        System.out.println("Display interface");
    }

    public static void main(String[] args) {
        TestInterface t = new TestInterface();
        t.display();
        System.out.println(name);
        System.out.println(a);
    }
}

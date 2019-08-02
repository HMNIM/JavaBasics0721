package com.javabasics.oops.abstraction;

public class DerivedConstructor extends BaseConstructor {

    public DerivedConstructor(){
        System.out.println("Derived constructor called");

    }

    @Override
    public void fun() {
        System.out.println("Derived fun");
    }
}

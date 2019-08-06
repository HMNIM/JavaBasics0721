package com.javabasics.oops.polymorphism;

public class Child extends Parent {

    @Override
    public void display() {
        super.display();
        System.out.println("Child's display");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Child's show");
    }

    public static void main(String args[])
    {
        Parent p = new Parent();
        p.display();
        p.show();
        Parent c = new Child();
        c.show();
        c.display();
    }

}



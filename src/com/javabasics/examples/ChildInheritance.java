package com.javabasics.examples;

public class ChildInheritance extends ParentInheritance {

    public void subtraction(int a, int b)
    {
        int c = a-b;
        System.out.println("Subtraction of two numbers : "+c);
    }

    public static void main(String[] args) {
        ChildInheritance inheritance = new ChildInheritance();
        inheritance.add(3, 4);
        inheritance.multiply(2, 7);
        inheritance.subtraction(6,1);
    }
}

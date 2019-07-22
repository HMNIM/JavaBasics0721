package com.javabasics.staticmethods;

public class StaticMethodsExample {

    public static final String nameStatic = "Haritha";

    public static String myStatMethod()
    {
        System.out.println("Calling static method");
        return "something";
    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }
    public int addition(int a, int b, int c)
    {
        int d = a+b+c;
        return d;

    }

}

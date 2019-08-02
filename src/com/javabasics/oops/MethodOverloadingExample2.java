package com.javabasics.oops;

public class MethodOverloadingExample2 {
    public void show(int x)
    {
        System.out.println(x);
    }
    public void show(String s)
    {
        System.out.println(s);
    }
    public void show(double d)
    {
        System.out.println(d);
    }
    public static void main(String args[])
    {
        MethodOverloadingExample2 m = new MethodOverloadingExample2();
        m.show(2);
        m.show("Haritha");
        m.show(22.3);
    }
}

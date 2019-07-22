package com.javabasics.staticmethods;

public class MyStaticMethods {

    private String name;
    // create static variable
    private static String staticName = "Static Name";

     public MyStaticMethods(String name) {
        this.name = name;
    }
    // create static method
    public static void myStatMethod()
    {
        System.out.println("This is static method");
        // can call directly static variable with class name
        System.out.println(MyStaticMethods.staticName);
       // you can not call instance variables here
    }
    public void myNonStatMethod()
    {
        System.out.println("this is my non static method");
        //we can call static variable in non static method also
        System.out.println(MyStaticMethods.staticName);
        // we can call instance variables in non static or regular method
        System.out.println("name is " + name);

    }
    public static void main(String[] args)
    {
        // we can call directly static variable with out creating object by class name
        MyStaticMethods.myStatMethod();
        // need to create an object to call non static method
        MyStaticMethods ms = new MyStaticMethods("Haritha");
        ms.myNonStatMethod();
    }
}

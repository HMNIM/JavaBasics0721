package com.javabasics.oops.abstraction;

   public abstract class Car{
    Car()
    {
        System.out.println("bike is created");
    }
    abstract void run();
    void changeGear()
    {
        System.out.println("gear changed");
    }
}
    class Honda extends Car{
    void run()
    {
        System.out.println("running safely..");
    }
}
    class TestAbstraction2{
    public static void main(String args[])
    {
        Car obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
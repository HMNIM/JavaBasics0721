package com.javabasics.staticmethods;

public class SingletonStaticBlock {

    public static void main(String args[])
    {
        Singleton s =  Singleton.getSingleInstance();
        s.testSingleton();
        System.out.println("test");
    }

}
class Singleton{

    // create static variable
    private static  Singleton singleInstance;
    static{
        singleInstance = new Singleton();
        System.out.println("static block will be called only once");
    }
    // create private constructor , so object can not be created by outside of class
    private Singleton()
    {
        System.out.println("creating Singleton object");
    }
    public static Singleton getSingleInstance()
    {
        System.out.println("testing");
        return singleInstance;

    }
    public void testSingleton()
    {
        System.out.println("object is instantiated");
    }
}
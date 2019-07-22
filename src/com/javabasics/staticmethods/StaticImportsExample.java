package com.javabasics.staticmethods;
import static com.javabasics.staticmethods.StaticMethodsExample.*;

public class StaticImportsExample {

    public static void main(String args[])
    {
        System.out.println(myStatMethod());
        System.out.println(add(2,8));
        System.out.println(nameStatic);
        StaticMethodsExample s = new StaticMethodsExample();
         System.out.println(s.addition(5 , 6 , 7));


    }
}

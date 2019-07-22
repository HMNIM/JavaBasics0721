package com.javabasics.staticmethods;
// to access all static members of the class
import static com.javabasics.staticmethods.MyStaticMembersClass.*;

public class MyStaticImportsClass {

    public static void main(String args[])
    {
        System.out.println(increment);
        System.out.println(incrementNumbers(5));

        int count = 10;
        System.out.println(incrementNumbers(count));
    }
}

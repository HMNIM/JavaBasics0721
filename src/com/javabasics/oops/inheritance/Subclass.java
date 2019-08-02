package com.javabasics.oops.inheritance;

public class Subclass extends SuperClass{
    int num = 5;
    public void display()
    {
        System.out.println("displaying sub class");
    }

    public void myMethod()
    {
        // instantiating sub class
        Subclass sub = new Subclass();
        // Invoking the display() method of sub class
        sub.display();
        // Invoking the display() method of super class
        super.display();
        // printing the value of variable num of subclass
        System.out.println("value of the variable named num in sub class:"+ sub.num);

        // printing the value of variable num of superclass
        System.out.println("value of the variable named num in super class:"+ super.num);
    }

    public static void main(String[] args) {
            Subclass sub = new Subclass();
            sub.myMethod();
    }
}

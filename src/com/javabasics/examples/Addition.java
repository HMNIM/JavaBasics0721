package com.javabasics.examples;

public class Addition {
    int a = 5;  // variable declaration(It is a piece of memory which holds the value)
    int b = 7;

    public void add() // method declaration
    {
        int c = a+b;
      System.out.println(c);
    }
    public static void main(String[] args) {
        Addition a = new Addition();
        a.add();
    }
}

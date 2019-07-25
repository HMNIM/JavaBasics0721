package com.javabasics.collections.vectorlist;

import java.util.Vector;

public class CloneVector {
    public static void main(String args[])
    {
        Vector<String> vc = new Vector<>();
        vc.add("Good mrng");
        vc.add("Good Evening");
        vc.add(1,"Hello");
        vc.add("Good night");
        System.out.println("Actual vector list " +vc);
        //copy or clone of vector
        Vector<String> copy = (Vector<String>) vc.clone();
        System.out.println("Copied or clone vector from actual vector " +copy);
    }
}

package com.javabasics.collections.vectorlist;

import java.util.Vector;

public class VectorExample {

    public static void main(String args[])
    {
        Vector<String> vc = new Vector<>();
        vc.add("third one");
        vc.add("fourth one");
        vc.add("first one");
        vc.add("second one");
        System.out.println("My first elements are "+vc);
        // adding index to element
        vc.add(2, "AddNewElement");
        System.out.println("after Adding element "+vc);
        System.out.println("Getting Element by index " +vc.elementAt(3));
        System.out.println("Getting first element " +vc.firstElement());
        System.out.println("getting last element "+vc.lastElement());
        System.out.println("" +vc.isEmpty());


    }
}

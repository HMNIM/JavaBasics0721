package com.javabasics.collections.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class MyEnumeration {

    public static void main(String args[]) {
        Vector<String> mylist = new Vector<String>();
        Enumeration<String> en = null;
        mylist.add("Java");
        mylist.add("Spring");
        mylist.add("React");
        mylist.add("Angular");
        en = mylist.elements();
        while(en.hasMoreElements())
        {
            System.out.println(en.nextElement());
        }
    }
}

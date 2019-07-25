package com.javabasics.collections.vectorlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorNewCollection {
    public static void main(String args[])
    {
        Vector<String> vc = new Vector<>();
        vc.add("one");
        vc.add("two");
        vc.add(1,"three");
        System.out.println("First list "+vc);
        List<String> mylist = new ArrayList<>();
        mylist.add("five");
        mylist.add(0, "ten");
        mylist.add("nine");
        vc.addAll(mylist);
        System.out.println("Adding/copying with another collection "+vc);
        vc.clear();
        System.out.println("After clearing all lists "+vc);
    }
}

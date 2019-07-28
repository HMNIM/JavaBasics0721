package com.javabasics.collections.vectorlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ClearVector {
    public static void main(String args[])
    {
        Vector<String> vc = new Vector<>();
        vc.add("coffee");
        vc.add("Tea");
        vc.add(1,"icedtea");
        vc.add("soda");
        System.out.println("My vector list " +vc);
        List<String> mylist = new ArrayList<>();
        mylist.add("icedtea");
        mylist.add("Tea");
        System.out.println("my lists are "+ vc.containsAll(mylist));
        mylist.add("ohhhhhhhhhhh");
        System.out.println("Does my list contains everything "+vc.containsAll(mylist));
        vc.clear();
        System.out.println("After clearing Vector list "+vc);
    }
}

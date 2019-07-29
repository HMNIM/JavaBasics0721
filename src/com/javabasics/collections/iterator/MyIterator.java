package com.javabasics.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator {
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Haritha");
        list.add("Mummy");
        list.add("Bangu");
        list.add("Kannaya");
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}

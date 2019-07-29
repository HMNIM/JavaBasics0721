package com.javabasics.collections.treeSet;


import java.util.Comparator;
import java.util.TreeSet;
public class ComparatorSet {
    public static void main(String args[]) {
        TreeSet<String> myTreeset = new TreeSet<String>(new MyComparator());
        myTreeset.add("teach");
        myTreeset.add("waiter");
        myTreeset.add("trainer");
        myTreeset.add("areal");
        System.out.println(myTreeset);
    }
}
 class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}






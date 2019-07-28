package com.javabasics.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("SHoor");
        list.add("reach");
        System.out.println(list);
        String[] arr = new String[list.size()];
        list.toArray();
        System.out.println(list);
        // sublist
        List<String> test = list.subList(1,2);

        System.out.println(test);
    }
}

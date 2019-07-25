package com.javabasics.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("sun");
        list.add("moon");
        list.add("mars");
        list.add("jupiter");
        list.add("Saturn");
        Collections.swap(list, 2,4);
        System.out.println(list);
    }
}

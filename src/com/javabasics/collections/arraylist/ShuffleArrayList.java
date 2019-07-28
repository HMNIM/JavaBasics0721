package com.javabasics.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("mrng");
        list.add("aftn");
        list.add("evng");
        list.add("nite");
        Collections.shuffle(list);
        System.out.println("After shuffling");
        for (String str:list
             ) {System.out.println(str);
        }
    }
}

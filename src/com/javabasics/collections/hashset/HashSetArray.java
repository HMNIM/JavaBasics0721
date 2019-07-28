package com.javabasics.collections.hashset;

import java.util.HashSet;

public class HashSetArray {
    public static void main(String args[]){
        HashSet<String> myhashset = new HashSet<>();
        myhashset.add("java");
        myhashset.add("groovy");
        myhashset.add("kafka");
        myhashset.add("spring");
        System.out.println("My actual hash set is : " +myhashset);
        String[] str = new String[myhashset.size()];
        myhashset.toArray(str);
        System.out.println("Converting hashset to array is : "+myhashset);
        for (String st:myhashset
             ) {
            System.out.println(st);
        }
    }
}

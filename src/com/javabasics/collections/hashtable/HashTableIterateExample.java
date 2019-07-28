package com.javabasics.collections.hashtable;

import java.util.Hashtable;
import java.util.Set;

public class HashTableIterateExample {
    public static void main(String args[]){

        Hashtable<Integer, Integer> myhash = new Hashtable<>();
        {
            myhash.put(1, 100);
            myhash.put(2, 200);
            myhash.put(3, 300);
            myhash.put(4, 400);
            myhash.put(5, 500);
            System.out.println(myhash);
            Set<Integer> myhash1 = myhash.keySet();
            for (Integer myhash2: myhash1
                 ) {
                System.out.println("Value of my keys " +myhash2 + " : " +myhash.get(myhash2));
            }
        }
    }
}

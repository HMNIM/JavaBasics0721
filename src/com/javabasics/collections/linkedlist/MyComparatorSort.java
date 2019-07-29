package com.javabasics.collections.linkedlist;

import java.util.Comparator;

public class MyComparatorSort implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if(o1.getUserId() > o2.getUserId()) {
            return 1;
        }else
        {
            return -1;
        }
    }

}

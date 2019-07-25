package com.javabasics.collections.arraylist;

import java.util.Comparator;

public class ComparatorCarSortList implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getCarPrice()  < o2.getCarPrice()){
            return 1;
        }else {
            return -1;
        }
    }

}

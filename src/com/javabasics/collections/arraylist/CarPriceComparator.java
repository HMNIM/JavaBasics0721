package com.javabasics.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class CarPriceComparator {
    public static void main(String args[]){
        ArrayList<Car> list = new ArrayList<>();
        list.add(new Car("Honda", 30000));
        list.add(new Car("dodge", 500000));
        list.add(new Car("civic", 5000));
        Collections.sort(list, new ComparatorCarSortList());
        for (Car c:list
             ) {System.out.println(c);

        }

    }
}

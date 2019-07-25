package com.javabasics.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorArraylistSort {
    public static void main(String args[])
    {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("tina", 40000));
        list.add(new Employee("bavitha", 100000));
        list.add(new Employee("david", 60000));
        list.add(new Employee("baby", 30000));
        Collections.sort(list, new MySalaryComaparision());
        for (Employee str:list) {
            System.out.println(str);

        }
    }

}

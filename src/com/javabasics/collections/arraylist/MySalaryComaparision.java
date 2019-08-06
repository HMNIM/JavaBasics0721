package com.javabasics.collections.arraylist;

import com.javabasics.collections.arraylist.Employee;

import java.util.Comparator;

public class MySalaryComaparision implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getSalary() <e2.getSalary())
        {
            return 1;
        }else{
        return -1;
        }
    }
}

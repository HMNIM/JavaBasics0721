package com.javabasics.staticmethods;

import java.util.ArrayList;
import java.util.List;

public class MyStaticBlockExample {


    private static List<Integer> list;
    static{
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
    }
    public void testList()
    {
        System.out.println(list);
    }


    public static void main(String args[]) {

        MyStaticBlockExample SB = new MyStaticBlockExample();
        SB.testList();

    }

}

package com.javabasics.collections.hashtable;

import com.javabasics.collections.arraylist.Employee;

import java.util.Hashtable;

public class HashTableUserKeys {
    public static void main(String args[])
    {
        Hashtable<Employ, String> myemp = new Hashtable<>();
        myemp.put(new Employ(1 , "HM", 5000), "Haritha");
        myemp.put(new Employ(2, "VM", 10000), "Venkat");
        myemp.put(new Employ(3, "HN", 1000), "Nimmaturi");
        myemp.put(new Employ(4, "VN", 90000), "Makkena");
        System.out.println(myemp);
        Employ e = new Employ(4, "VN", 90000);
        System.out.println( e + " -->" +myemp.get(e));

    }

}

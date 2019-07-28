package com.javabasics.collections.hashtable;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class EnumerationExample {
    public static void main(String args[])
    {
        Hashtable<String, String> myhash = new Hashtable<>();
        myhash.put("pot", "plant");
        myhash.put("bed", "bath");
        myhash.put("english", "vnglish");
        myhash.put("tea", "biscuit");
        Enumeration<String> en = myhash.keys();
        while (en.hasMoreElements())
        {
            System.out.println(en.nextElement());
        }



    }
}

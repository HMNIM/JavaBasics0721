package com.javabasics.collections.vectorlist;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorSubrange {
    public static void main(String args[]){
        Vector<String> vct = new Vector<>();
        vct.add("java");
        vct.add("test");
        vct.add("true");
        vct.add("oops");
        System.out.println("my vector list "+vct);
        List<String> list = vct.subList(1, 3);
        System.out.println("my sublist in vector list "+list);
    }
}

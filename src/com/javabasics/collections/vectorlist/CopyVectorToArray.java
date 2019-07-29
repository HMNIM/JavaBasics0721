package com.javabasics.collections.vectorlist;

import java.util.Vector;

public class CopyVectorToArray {
    public static void main(String args[])
    {
        Vector<String> vc = new Vector<>();
        vc.add("Java");
        vc.add("Spring");
        vc.add("Spring Boot");
        System.out.println("my vector list "+vc);
        String[] arr = new String[vc.size()];
        vc.copyInto(arr);
        System.out.println("vector list copied in to array");
        for(String str:vc){
            System.out.println(str);
        }



     }
}

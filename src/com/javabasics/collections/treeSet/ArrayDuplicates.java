package com.javabasics.collections.treeSet;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ArrayDuplicates {
    public static void main(String args[])
    {
        String[] strArr = {"java", "spring", "boot", "kafka", "java"};
        List<String> myArr = Arrays.asList(strArr);
        System.out.println("Actual array : " + myArr);
        TreeSet<String> mytreeset = new TreeSet<>(myArr);
        System.out.println("My Tree set doest not contain dupliactes "+mytreeset);


    }
}

package com.javabasics.arrays;

import java.util.Arrays;

public class BinarySearchOnArray {
    public static void main(String args[])
    {
        char[] alphabetsArr = {'s', 'g', 'j' , 'k' , 'n' , 'm' , 'o', 'p'};
        int index = Arrays.binarySearch(alphabetsArr, 0 ,alphabetsArr.length-1, 'n');
        System.out.println(index);
    }
}


package com.javabasics.collections.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SwapLinkedList {

        public static void main(String args[]){
            LinkedList<String> mylist = new LinkedList<>();
            mylist.add("test");
            mylist.add("marks");
            mylist.add("pass");
            mylist.add("rank");
            System.out.println("My actual list" +mylist);
            try{
            Collections.swap(mylist, 1, 4);
            System.out.println(mylist);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println(mylist);
            }


        }
}

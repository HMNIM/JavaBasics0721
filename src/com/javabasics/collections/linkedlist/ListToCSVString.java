package com.javabasics.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ListToCSVString {

    public String getListAsCsvString(List<String> list){

        StringBuilder sb = new StringBuilder();
        for(String str:list){
            if(sb.length() != 0){
                sb.append(",");
            }
            sb.append(str);
        }
        return sb.toString();
    }
    public static void main(String args[])
    {
        LinkedList<String> mylist = new LinkedList<>() {
            {   this.add("java");
                this.add(".net");
                this.add("cobol");
            }
        };
        System.out.println("My actual list" +mylist);
        ListToCSVString lcs = new ListToCSVString();
        System.out.println(lcs.getListAsCsvString(mylist));
        List<String> lis = new LinkedList<String>(){
            {
                this.add("java");
                this.add("unix");
                this.add("c++");
            }
        };
        System.out.println(lcs.getListAsCsvString(lis));



    }
}

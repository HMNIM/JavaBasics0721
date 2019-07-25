package com.javabasics.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListtoCSVString {

    public String getListCsvString(List<String> mylist) {
        StringBuilder sb = new StringBuilder();
        for(String str:mylist){
            if(sb.length()!=0){
                sb.append(",");
            }sb.append(str);
        }return sb.toString();
    }
    public static void main(String args[]){
        List<String> mylist1 = new ArrayList<>(){
            {
                    this.add("tea");
                    this.add("cafe");
                    this.add("wave");
            }
        };
        ListtoCSVString lcs = new ListtoCSVString();
        System.out.println(lcs.getListCsvString(mylist1));



    }
}

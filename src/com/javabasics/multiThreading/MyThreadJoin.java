package com.javabasics.multiThreading;

import java.util.ArrayList;
import java.util.List;

public class MyThreadJoin {

    public static List<String> names = new  ArrayList<>();

    public static void main(String[] args) {
        List<SampleThread> str = new ArrayList<>();
        for(int i = 0; i<=10; i++)
        {
            SampleThread s = new SampleThread();
            str.add(s);
            s.start();
        }
        for(SampleThread st :str)
        {
            try{
                st.join();
            }catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            System.out.println(names);
        }
    }


}

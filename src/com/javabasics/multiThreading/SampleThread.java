package com.javabasics.multiThreading;

public class SampleThread extends Thread {

    public void run()
    {
        for(int i = 0; i<=10 ; i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e)
            {
                System.out.println("Exception in main thread "+e.getMessage());
            }
        }
        MyThreadJoin.names.add(getName());
    }
}

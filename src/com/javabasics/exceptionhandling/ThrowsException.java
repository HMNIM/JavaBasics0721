package com.javabasics.exceptionhandling;

public class ThrowsException {
    public static void main(String args[])
    {
        ThrowsException te = new ThrowsException();
        try{
            for(int i=0; i<5; i++){
               te.getJunk();
               System.out.println(i);
            }
        } catch (InterruptedException iex){
            iex.printStackTrace();
        }
    }

        public void getJunk() throws InterruptedException {
        Thread.sleep(1000);
    }
}

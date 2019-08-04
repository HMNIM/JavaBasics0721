package com.javabasics.multithreadingExamples;

public class WorkerThread1 implements Runnable {
    private String command;

    public WorkerThread1(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting command : "+command );
        processCommand();
        System.out.println(Thread.currentThread().getName()+ " Ending  command : "+command);
    }

    private void processCommand() {
        try{
            Thread.sleep(1000);
        }catch(Exception e)
        {
            System.out.println("Exception is "+e);
        }
    }
}

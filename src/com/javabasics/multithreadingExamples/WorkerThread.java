package com.javabasics.multithreadingExamples;

public class WorkerThread  implements Runnable{

    private String message;

    public WorkerThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" (start) message = " +message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + "End");
    }
    public void processMessage()
    {
        try {
            System.out.println("Thread is running (method call )" +message);
            Thread.sleep(2000);
        }catch(Exception e)
                {
                    System.out.println("Exception is "+e.getMessage());
                }
    }
}


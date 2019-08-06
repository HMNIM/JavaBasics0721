package com.javabasics.multithreadingExamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample1 {
    public static void main(String[] args) {
        // create a thread pool
        ExecutorService exe = Executors.newFixedThreadPool(5);
        for(int i = 0; i<=10; i++)
        {
            Runnable  work = new WorkerThread1("" +i);
            exe.execute(work);

        }
        exe.shutdown();
        while(!exe.isTerminated())
        {

        }
        System.out.println("Completed threads");
    }
}

package com.javabasics.multithreadingExamples;

public class TestDaemonThread1 implements Runnable {
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Daemon Thread");
        }else
        {
            System.out.println("User thread");
        }
    }

    public static void main(String[] args) {
        TestDaemonThread1 d1 = new TestDaemonThread1();
        TestDaemonThread1 d2 = new TestDaemonThread1();
        TestDaemonThread1 d3 = new TestDaemonThread1();
        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);
        t2.start();
        t2.setDaemon(true);
        t3.setDaemon(false);
        t1.start();
       // t2.start();
        t3.start();
    }
}

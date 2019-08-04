package com.javabasics.multithreadingExamples;
// annonymous class that implements Runnable interface
public class TestMultitasking5 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("taskk oneeeeeeee");
            }
        };
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Second task");
            }
        };
        Thread t1 = new Thread(r);
        t1.start();
        Thread t2 = new Thread(r1);
        t2.start();
    }
}

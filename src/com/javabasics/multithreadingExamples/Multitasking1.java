package com.javabasics.multithreadingExamples;

public class Multitasking1 extends Thread {
//if you have to perform single task by many threads, have only one run() method
    public void run()
    {
        System.out.println("Task one");
    }
    public static void main(String[] args) {
        Multitasking1 m1 = new Multitasking1();
        Multitasking1 m2 = new Multitasking1();
        Multitasking1 m3 = new Multitasking1();
        m1.start();
        m2.start();
        m3.start();
    }
}

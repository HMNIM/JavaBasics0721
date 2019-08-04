package com.javabasics.multithreadingExamples;

public class TestMultitasking2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task one");
    }

    public static void main(String[] args) {
       Thread t1 = new Thread(new TestMultitasking2());
       t1.start();
       Thread t2 = new Thread(new TestMultitasking2());
       t2.start();
       Thread t3 = new Thread(new TestMultitasking2());
       t3.start();
       TestMultitasking2 m = new TestMultitasking2();
       Thread t = new Thread(m);
       t.start();

    }
}

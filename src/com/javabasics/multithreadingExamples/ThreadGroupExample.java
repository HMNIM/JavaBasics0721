package com.javabasics.multithreadingExamples;

public class ThreadGroupExample implements Runnable {
    @Override
    public void run() {
        System.out.println("name of Threads : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupExample runnable = new ThreadGroupExample();
        ThreadGroup tg = new ThreadGroup("Parent Group"); // creating Thread group
        Thread t1 = new Thread(tg, runnable, "one");
        t1.start();
        Thread t2 = new Thread(tg, runnable, "two");
        t2.start();
        Thread t3 = new Thread(tg, runnable, "Three");
        t3.start();
        tg.setDaemon(true);
        System.out.println(" Thread group name : "+tg.getName());
        tg.list();
    }
}

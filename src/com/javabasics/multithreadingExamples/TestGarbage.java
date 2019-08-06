package com.javabasics.multithreadingExamples;

public class TestGarbage {

    public void finalize()
    {
        System.out.println("object is garbage collected");
    }

    public static void main(String[] args) {
        TestGarbage t1 = new TestGarbage();
        TestGarbage t2 = new TestGarbage();
        t1= null;
        t2= null;
        System.gc();

    }
}

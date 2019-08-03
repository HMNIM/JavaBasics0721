package com.javabasics.multithreadingExamples;

public class TestCurrentThread extends Thread{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) throws InterruptedException {

		TestCurrentThread t1 = new TestCurrentThread();
		TestCurrentThread t2 = new TestCurrentThread();
		TestCurrentThread t3 = new TestCurrentThread();
		t1.sleep(1000);
		t1.start();
		
		t2.start();
		t3.start();

	}

}

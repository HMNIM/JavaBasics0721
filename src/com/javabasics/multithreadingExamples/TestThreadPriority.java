package com.javabasics.multithreadingExamples;

public class TestThreadPriority extends Thread {

	public void run()
	{
		System.out.println("Running thread name is "+Thread.currentThread().getName());
		System.out.println("Running Thread priority is " +Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		
		TestThreadPriority t1 = new TestThreadPriority();
		TestThreadPriority t2 = new TestThreadPriority();
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t1.setName("Haritha");
		t2.setName("Kannaya");
		t1.start();
		t2.start();

	}

}

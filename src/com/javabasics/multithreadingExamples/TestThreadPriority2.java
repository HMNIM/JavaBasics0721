package com.javabasics.multithreadingExamples;

public class TestThreadPriority2 implements Runnable {
	
	@Override
	public void run() {
		
		System.out.println(" Running Thread name is " +Thread.currentThread().getName());
		System.out.println(" Running Thread name is " +Thread.currentThread().getId());
		System.out.println(" Running Thread name is " +Thread.currentThread().getPriority());
	}


	public static void main(String[] args) {
		
		TestThreadPriority2 p1 = new TestThreadPriority2();
		TestThreadPriority2 p2 = new TestThreadPriority2();
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		t1.setName("Makkena");
		t2.setName("Nimmaturi");
		
		t1.setPriority(3);
		t2.setPriority(5);
		
		t1.start();
		t2.start();
		
	

	}


}

package com.javabasics.multithreadingExamples;

public class TestGetNameMethod2 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread is running");
		
	}

	public static void main(String[] args) {
		TestGetNameMethod2 g1 = new TestGetNameMethod2();
		TestGetNameMethod2 g2 = new TestGetNameMethod2();
		Thread t1 = new Thread(g1);
		Thread t2 = new Thread(g2);
		
		t1.start();
		System.out.println(" Getting t1 name " +t1.getName());
		System.out.println(" Getting t1 name " +t1.getId());
		System.out.println(" Getting t1 name " +t1.getPriority());
		
		System.out.println(" Getting t2 name " +t2.getName());
		System.out.println(" Getting t2 name " +t2.getId());
		System.out.println(" Getting t2 name " +t2.getPriority());
		t2.start();
		
		t1.setName("Mummy");
		
		System.out.println(" After change name of t1 " +t1.getName());
		
		
	}

	
}

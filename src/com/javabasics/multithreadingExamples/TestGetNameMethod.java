package com.javabasics.multithreadingExamples;

public class TestGetNameMethod extends Thread {

	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		
		TestGetNameMethod t1 = new TestGetNameMethod();
		TestGetNameMethod t2 = new TestGetNameMethod();
		TestGetNameMethod t3 = new TestGetNameMethod();
		
		System.out.println(" getting t1 name " +t1.getName());
		System.out.println(" getting t1 name " +t2.getName());
		System.out.println(" getting t1 name " +t3.getName());
		System.out.println(" getting t1 name " +t1.getId());
		System.out.println(" getting t1 name " +t2.getId());
		System.out.println(" getting t1 name " +t3.getId());
		t1.start();
		t2.start();
		t3.start();
		t1.setName("Haritha");
		System.out.println("Changing get t1 name " +t1.getName());
	}

}

package com.javabasics.multithreadingExamples;

public class TestJoinMethod2 implements Runnable{
	
	
	@Override
	public void run() {
		for(int i = 0; i<5; i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("exception is "+e.getMessage());
			}
			System.out.println(i);
		}
		
	}

	
	public static void main(String[] args) throws InterruptedException {
		TestJoinMethod2 j1 = new TestJoinMethod2();
		TestJoinMethod2 j2 = new TestJoinMethod2();
		TestJoinMethod2 j3 = new TestJoinMethod2();
		TestJoinMethod2 j4 = new TestJoinMethod2();
		
		Thread t1 = new Thread(j1);
		t1.start();
		t1.join();
		Thread t2 = new Thread(j2);
		t2.start();
		t2.join(1500);
		Thread t3 = new Thread(j3);
		t3.start();
		Thread t4 = new Thread(j4);
		t4.start();

	}

	
}

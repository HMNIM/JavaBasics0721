package com.javabasics.multithreadingExamples;

public class TestSleepMethod2 implements Runnable{
	
	@Override
	public void run() {
		for(int i = 1; i<=5; i++)
		{
			try {
				System.out.println("Thread running");
				Thread.sleep(500);
				
			}catch(InterruptedException e) {
				
			}
			System.out.println(i);
		}
		
	}


	public static void main(String[] args) {
		TestSleepMethod2 t1 = new TestSleepMethod2();
		Thread t = new Thread(t1);
		t.start();
		TestSleepMethod2 t2 = new TestSleepMethod2();
		Thread t3 = new Thread(t2);
		t3.start();

	}

	
}

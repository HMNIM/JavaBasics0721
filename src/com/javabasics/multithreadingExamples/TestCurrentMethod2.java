package com.javabasics.multithreadingExamples;

public class TestCurrentMethod2 implements Runnable{

	
	@Override
	public void run() {
		
		for(int i = 1; i<3; i++)
		{
			try {
				
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	
	}
	
	public static void main(String[] args) {
		TestCurrentMethod2 c1 = new TestCurrentMethod2();
		TestCurrentMethod2 c2 = new TestCurrentMethod2();
		TestCurrentMethod2 c3 = new TestCurrentMethod2();
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		t1.start();
		t2.start();
		t3.start();

	}

	

}

package com.javabasics.multithreadingExamples;

public class TestSleepMethod extends Thread{
	
	public void run()
	{
		for(int i = 0; i<=5; i++)
		{
			try {
				Thread.sleep(500);
			}catch(InterruptedException e)
			{
				System.out.println("Exception is " +e.getLocalizedMessage());
			}
			System.out.println(i);
		}
		
	}

	
	public static void main(String[] args) {
		TestSleepMethod t1 = new TestSleepMethod();
		t1.start();
		TestSleepMethod t2 = new TestSleepMethod();
		t2.start();
	
	}

}

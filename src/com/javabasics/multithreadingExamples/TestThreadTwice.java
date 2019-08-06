package com.javabasics.multithreadingExamples;

public class TestThreadTwice extends Thread {
	public void run()
	{
		for(int i= 0; i<=4; i++)
		{
			try {
				Thread.sleep(500);
			}catch(InterruptedException e)
			{
				System.out.println("Exception is " +e.getMessage());
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		TestThreadTwice t = new TestThreadTwice();
		t.start();
		t.start();

	}

}

package com.javabasics.multithreadingExamples;

public class MyRunnableThread implements Runnable  {
	
	public static int thecount;
	
	public MyRunnableThread()
	{
		System.out.println(" Calling constructor");
	}

	@Override
	public void run() {
	
		while(MyRunnableThread.thecount <=10)
		{
		try {
		System.out.println(" Thread "  + (++MyRunnableThread.thecount));
		Thread.sleep(100);
		}catch(Exception e)
		{
			System.out.println("Exception is " +e);
		}
		
		}
		
	}
	

}

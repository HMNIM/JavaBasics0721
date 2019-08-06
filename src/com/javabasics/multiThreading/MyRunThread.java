package com.javabasics.multiThreading;

public class MyRunThread {

	public static void main(String[] args) {
			
			MyRunnableThread mrt = new MyRunnableThread();
			// create a thread object and pass Runnable implementation class object to its constructor.
			Thread t = new Thread(mrt);
			t.start();
			while(MyRunnableThread.thecount <= 10)
			{
				try {
					System.out.println("Main Thread" +(++MyRunnableThread.thecount));
					Thread.sleep(100);
					
				}catch(Exception e) {
					System.out.println(" Exception in main thread is "+e);
				}
			}
			System.out.println("End of main thread");
	}

	
}

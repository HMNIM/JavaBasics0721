package com.javabasics.multiThreading;

public class MyRunExtendThread {

	public static void main(String[] args) {
	
		MyExtendThread m = new MyExtendThread();
		m.start();
		
		while(MyExtendThread.tcount <=5)
		{
			try {
				System.out.println(" My extend main thread " +(++MyExtendThread.tcount));
				Thread.sleep(100);
			}catch(Exception e)
			{
				System.out.println(" My exception in main thread "+e.getMessage() );
			}finally {
				System.out.println("No exceptions found");
			}
		}
		System.out.println(" End of main method");
	}

}

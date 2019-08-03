package com.javabasics.multithreadingExamples;

public class MyExtendThread extends Thread{
	
		public static int tcount;
		
		public void run()
		{
			while(MyExtendThread.tcount <= 5)
			{
				try {
					System.out.println(" My extend thread "+(++MyExtendThread.tcount));
					Thread.sleep(100);
				}catch(Exception e)
				{
					System.out.println("Exception in extend thread is " +e.getMessage());
				}finally {
					System.out.println(" No Exceptions found");
				}
			}
		}
	
	

}

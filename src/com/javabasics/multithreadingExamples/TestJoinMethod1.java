package com.javabasics.multithreadingExamples;

public class TestJoinMethod1 extends Thread{
	
	public void run()
	{
		for(int i = 0; i<=5 ; i++) {
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println("Exception is "+e.getMessage());
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		TestJoinMethod1 t1 = new TestJoinMethod1();
		TestJoinMethod1 t2 = new TestJoinMethod1();
		TestJoinMethod1 t3 = new TestJoinMethod1();
		TestJoinMethod1 t4 = new TestJoinMethod1();
		
		t1.start();
		try {
			t1.join();
		}catch(Exception e) {
			System.out.println("Exception in main method is " +e.getMessage());
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		t4.start();
	}

}

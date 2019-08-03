package com.javabasics.multithreadingExamples;

public class Multi2  implements Runnable{
	
	@Override
	public void run() {
	System.out.println(" Thread is ruuning implememted by runnable interface");
	}

	public static void main(String[] args) {
		Multi2 m2 = new Multi2();
		Thread t2 = new Thread(m2);
		t2.start();
		

	}

	
}

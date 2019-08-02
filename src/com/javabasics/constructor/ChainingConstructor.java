package com.javabasics.constructor;

public class ChainingConstructor {
	 int i; int j; int k;
	
	public ChainingConstructor() {
		super();
		System.out.println("default");
	}
	
	public ChainingConstructor(int i) {
		super();
		this.i = i;
		System.out.println("single parameters");
	}
		public ChainingConstructor(int i, int j) {
			this.j = j;
			System.out.println("two parameters");
	}
	public ChainingConstructor(int i, int j, int k) {
			
			this.k = k;
			
			System.out.println("three parameters");
		}

	public static void main(String[] args) {
	
		ChainingConstructor ch = new ChainingConstructor(10, 20, 30);
	}

}

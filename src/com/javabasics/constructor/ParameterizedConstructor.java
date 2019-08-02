package com.javabasics.constructor;

public class ParameterizedConstructor {

	String name ;
	int id;
	float distance;
	double percentage;
	
	
	public ParameterizedConstructor(String name, int id, float distance, double percentage) {
		super();
		this.name = name;
		this.id = id;
		this.distance = distance;
		this.percentage = percentage;
		System.out.println("Parameterized constructor");
		System.out.println("values of parameters are " + name + " ," + id + " , " + percentage + " ," + distance );

	}


	public static void main(String[] args) {
		ParameterizedConstructor pc = new ParameterizedConstructor("Haritha", 7, 100, 3.79);
	
	}
	
}

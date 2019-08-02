package com.javabasics.oops.oops;

public class TestSchool implements StudentSchool{

	

	@Override
	public void learn() {
		System.out.println(" learning in school ");
		
	}

	@Override
	public void teach() {
		System.out.println("Teaching in school");
		
	}
	public static void main(String[] args) {
		 TestSchool t = new TestSchool();
		 t.teach();
		 t.learn();

	}


}

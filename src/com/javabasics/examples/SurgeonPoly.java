package com.javabasics.examples;

public class SurgeonPoly extends DoctorPolymorphism {
    @Override
    public void treatment() {
        System.out.println(" Surgeon Operation treatment");
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("Surgeon operates");
    }


    public static void main(String[] args) {
        DoctorPolymorphism d = new DoctorPolymorphism();
        d.treatment();
        SurgeonPoly s = new SurgeonPoly();
        s.treatment();
        s.operation();
        d.regularcheck();
    }
}
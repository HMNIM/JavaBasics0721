package com.javabasics.examples;

public class CalculationOverloading {
    public void  add(int a, int b)
    {
        int c = a+b;
        System.out.println(c);
    }
    public void add(int a, int b, int c)
    {
      int d = a-b-c;
      System.out.println(d);
    }
    public void add(double a , double b, double c, double d){
        double e = a*b*c*d;
        System.out.println(e);
    }

    public static void main(String[] args) {
        CalculationOverloading overloading = new CalculationOverloading();
        overloading.add(2,4);
        overloading.add(7,4,3);
        overloading.add(3, 5, 3, 5);

    }

}

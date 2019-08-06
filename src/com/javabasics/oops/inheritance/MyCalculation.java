package com.javabasics.oops.inheritance;

public class MyCalculation extends Calculation {

   public  int multiply(int x , int y)
   {
        z = x * y;
       return z;
   }
   public int div(int x , int y){
        z = x / y;
       return z;
   }

    public static void main(String[] args) {
        MyCalculation m = new MyCalculation();
        System.out.println("Addition of  given numbers is " + m.addition(3 , 4));
        System.out.println("Subtraction of given numbers is "+m.subtraction(20, 8));
        System.out.println("Multiplication of given numbers is " +m.multiply(2, 6));
        System.out.println("Division of given numbers is " +m.div(10, 5));
    }
}

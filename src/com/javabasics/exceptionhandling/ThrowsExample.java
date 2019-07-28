package com.javabasics.exceptionhandling;

public class ThrowsExample {

    public static void main(String args[]) throws Exception {
        ThrowsExample te = new ThrowsExample();
        te.testing();
    }

    private void testing() throws ArithmeticException{
        for(int i = 5; i<=10 ;i--){
            System.out.println(10/i);

            System.out.println(i);
        }

    }


}

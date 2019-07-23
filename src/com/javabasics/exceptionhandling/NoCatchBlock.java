package com.javabasics.exceptionhandling;

public class NoCatchBlock {
    public static void main(String args[]) throws ArithmeticException
    {
        try{
            int i = 20/0;
            {
                System.out.println(i);
            }

        }finally {
            System.out.println("Final block");
        }
    }
}

package com.javabasics.exceptionhandling;

public class MyExceptionHandle {
    public static void main(String args[]) {
        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i);
            }

        } catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }

    }
}

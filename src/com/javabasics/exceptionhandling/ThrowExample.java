package com.javabasics.exceptionhandling;

public class ThrowExample {
    public static void main(String args[]){
        try{
          draw();
        }catch(NullPointerException e){
            System.out.println("inside main exception "+e.getMessage());

        }

    }

    private static void draw() {
        try {
            throw new NullPointerException();
        }catch (NullPointerException e)
        {
            System.out.println("inside method exception " +e.getMessage());
        }
    }

}

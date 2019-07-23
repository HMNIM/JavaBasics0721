package com.javabasics.exceptionhandling;

public class FinallyBlock {
    public static void main(String args[])
    {
        try{
            int i = 10;
            {
                System.out.println(i);
            }

        }catch(Exception e) {
            System.out.println("Catch block ");
        }finally
        {
            System.out.println("Final block");
        }
        try{
            int i =20/0;

        }catch(Exception e){
            System.out.println("second catch block" +e.getMessage());
        }finally {
            System.out.println("second final block");
        }
    }
}

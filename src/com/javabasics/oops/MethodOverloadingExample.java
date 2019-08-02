package com.javabasics.oops;

public class MethodOverloadingExample {


        public int  sum(int x,  int y)
        {
            return x + y;
        }
        public int sum(int x, int y, int z)
        {
            return x + y + z;
        }
        public int sum(int x, int y, int z, int a)
        {
            return x * y * z * a;
        }
    public static void main(String args[])
    {
        MethodOverloadingExample MO = new MethodOverloadingExample();
        System.out.println(MO.sum(2, 4));
        System.out.println(MO.sum(3,5, 7));
        System.out.println(MO.sum(1, 2, 3, 4));


    }
}
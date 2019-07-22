package com.javabasics.staticmethods;

public class StaticExamples {
    private  static int a = 3; static int b = 4; static int c  = 7;

    public StaticExamples() {
    }

    public  static void add()
    {
        int d = a +b +c;
        System.out.println(d);
    }
    public static void main(String[] args)
    {
        StaticExamples.add();
    }

}

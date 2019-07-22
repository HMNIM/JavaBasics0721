package com.javabasics.staticmethods;

public class StaticVsContructor {
    private String name;
    private static String namestatic = "Venny";

    public StaticVsContructor(String name) {
        this.name = name;
        System.out.println(name);
    }
    public static void testing()
    {
        System.out.println("static method can be called by only once " +namestatic);
    }
    public static void main(String args[]){
        StaticVsContructor sc1 = new StaticVsContructor("Jerry");
        StaticVsContructor sc2= new StaticVsContructor("Jill");
        StaticVsContructor sc3 = new StaticVsContructor("Karen");

        StaticVsContructor.testing();// only once possible to call static method


    }
}

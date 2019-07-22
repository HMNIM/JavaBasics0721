package com.javabasics.staticmethods;

public class StaticBlockVsConstrutor {

    static {
        System.out.println("I am in static block");
        System.out.println("Static will be called first than the constructor");
        System.out.println("Static block will be called only once");
    }
        public StaticBlockVsConstrutor()
        {
            System.out.println("I am in constructor");
            System.out.println("Constructor can be called manytimes");
        }
        public static void main(String args[])
        {
            StaticBlockVsConstrutor callingconstructor1 = new StaticBlockVsConstrutor();
            StaticBlockVsConstrutor callingconstructor2= new StaticBlockVsConstrutor();
            StaticBlockVsConstrutor callingconstructor3 = new StaticBlockVsConstrutor();
            StaticBlockVsConstrutor callingconstructor4 = new StaticBlockVsConstrutor();
            StaticBlockVsConstrutor callingconstructor5 = new StaticBlockVsConstrutor();


        }


}

package com.javabasics.oops.abstraction;

public class MainFinal {
    public static void main(String[] args) {
        BaseFinal b = new DerivedFinal();
        b.fun();
        DerivedFinal d = new DerivedFinal();
        d.fun();
    }
}

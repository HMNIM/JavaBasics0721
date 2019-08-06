package com.javabasics.oops.abstraction;

public class TestBank {
    public static void main(String[] args) {
        Bank b = new AxisBank();
        System.out.println("Rate of interest is " + b.getBankInterest());
        Bank b1 = new ICICIBank();
       System.out.println("Rate of interest is " +b1.getBankInterest());
    }

}

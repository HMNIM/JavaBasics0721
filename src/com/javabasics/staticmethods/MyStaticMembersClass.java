package com.javabasics.staticmethods;

public class MyStaticMembersClass {
    //when we apply "static" keyword to a variable ,it means it belongs to class.
    // static means there is only one copy of the variable in memory shared by all instances of the class.
    // The final keyword just means the value can't be changed. Without final, any object can change the value of the variable.
    public static final int increment = 2;
    public static int incrementNumbers(int num)
    {
        return num +increment;
    }
}

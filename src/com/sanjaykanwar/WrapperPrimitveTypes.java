package com.sanjaykanwar;

/**
 * Created by sanjay kanwar on 5/01/2017.
 */
public class WrapperPrimitveTypes {
    public static void main(String[] args) {
        // Creates an Integer object from an int
        Integer intObj1 = new Integer(100);
        Integer i = 100;
        int j = 100;
        System.out.println("I " + (Integer) i + " j " + (int) j);

        // Creates an Integer object from a String
        Integer intObj2 = new Integer("1969");

        // Creates a Double object from a double
        Double doubleObj1 = new Double(10.45);

        // Creates a Double object from a String
        Double doubleObj2 = new Double("234.60");

        // Creates a Character object from a char
        Character charObj1 = new Character('A');

        // Creates a Boolean object from a boolean
        Boolean booleanObj1 = new Boolean(true);

        // Creates Boolean objects from Strings
        Boolean booleanTrue = new Boolean("true");
        Boolean booleanFalse = new Boolean("false");
    }
}

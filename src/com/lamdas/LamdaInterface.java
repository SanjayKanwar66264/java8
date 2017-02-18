package com.lamdas;

/**
 * Created by sanjay kanwar on 6/01/2017.
 */
public class LamdaInterface {
    public static void main(String[] args) {
        Processor processor = (String str) -> str.length();
        SecondProcessor secondProcessor = (String str) -> str.length();
        String name = "Java";
        int length = processor.getStringLength(name);
        System.out.println(length);

    }
}

@FunctionalInterface
interface Processor{
    int getStringLength(String str);

}

@FunctionalInterface
interface SecondProcessor{
    int noName(String str);
}

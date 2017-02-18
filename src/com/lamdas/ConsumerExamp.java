package com.lamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by sanjay kanwar on 18/01/2017.
 */
public class ConsumerExamp {

    public static void main(String[] args) {
        getLanguagesStartingWith();
    }


    public static void getLanguagesStartingWith(){
        Consumer<String> c = (x) -> System.out.println("Promming Language " + x + " Starts With J " + x.startsWith("J"));
            c.accept("Java");
            c.accept("C");
            c.accept("Perl");

    }

}

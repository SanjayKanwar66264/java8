package com.sanjaykanwar;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by sanjay kanwar on 3/01/2017.
 */
public class FirstArray {

    public static void main(String[] args){
        Collection<String> names = new ArrayList<>();
        System.out.printf("Size = %d, Elements = %b%n", names.size(), names);
        names.add("Tim");
        names.add("Richard");
        names.add("Theo");
        names.add("Adam");
        names.add("Jen");
        names.add("San");

        System.out.printf("Size = %d, Elemenets = %s%n", names.size(), names);
        names.remove("Tim");
        System.out.printf("Size = %d, Elements = %sn", names.size(), names);
        names.clear();
        System.out.printf("Size = %d, Elements = %s%n", names.size(), names);
    }
}

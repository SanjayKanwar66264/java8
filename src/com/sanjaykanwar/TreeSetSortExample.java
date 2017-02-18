package com.sanjaykanwar;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by sanjay kanwar on 3/01/2017.
 */
public class TreeSetSortExample {
    public static void main(String[] args){
        Set<String> names = new TreeSet<>();
        names.add("Maths");
        names.add("Physics");
        names.add("Chemistry");
        names.add("Biology");

        for(String name: names){
            System.out.println(name);
        }
    }
}

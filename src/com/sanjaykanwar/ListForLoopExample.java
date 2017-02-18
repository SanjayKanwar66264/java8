package com.sanjaykanwar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sanjay kanwar on 3/01/2017.
 */
public class ListForLoopExample {

    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("Sam");
        names.add("Tes");
        names.add("George");
        for (String name : names){
            System.out.println("Names:" + name);
        }
        names.forEach(name -> System.out.println(name.compareToIgnoreCase("Tes")));

    }
}

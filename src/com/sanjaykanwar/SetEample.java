package com.sanjaykanwar;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by sanjay kanwar on 3/01/2017.
 */
public class SetEample {

    public static void main(String [] args){
        Set<String> names = new LinkedHashSet<>();
            names.add("John");
            names.add("Genny");
            names.add("Mark");
            names.add("John"); // Duplicate Item in Set


        Set<String> newNameList;
        newNameList = new LinkedHashSet<>();
        newNameList.add("Java");
        newNameList.add("C#");
        newNameList.add(null);
        newNameList.add("Genny");

        names.retainAll(newNameList);

        System.out.println("Retain All===================================");
        for(String name : names){
            System.out.println(name);
        }

        names.addAll(newNameList);
        System.out.println(" Add All===================================");
        for(String name : names){
            System.out.println(name);
        }

        names.removeAll(newNameList);
        System.out.println("removeAll===================================");
        for(String name : names){
            System.out.println(name);
        }


    }
}

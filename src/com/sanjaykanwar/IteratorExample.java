package com.sanjaykanwar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sanjay kanwar on 3/01/2017.
 */
public class IteratorExample {

    public static void main(String [] args){
        List<String> names = new ArrayList<>();
        names.add("Cook");
        names.add("Job");
        names.add("Gates");

        Iterator<String> nameIterator =   names.iterator();
        while(nameIterator.hasNext()) {
            System.out.println("Names: " + nameIterator.next());
            nameIterator.remove();
        }
        System.out.println("After Names: " + names);
    }
}

package com.sanjaykanwar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by sanjay kanwar on 5/01/2017.
 */
public class ConsumerForEachRemaining {

    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Tim");
        names.add("Tam");
        names.add("TTT");

        Iterator<String> iterator = names.iterator();
        iterator.forEachRemaining( it -> System.out.println(it));
    }
}

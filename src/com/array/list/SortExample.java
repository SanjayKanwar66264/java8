package com.array.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sanjay kanwar on 6/02/2017.
 */
public class SortExample {
    public static void main(String[] args) {
        List<String> animalList = new ArrayList<String>();
        animalList.add("Monkey");
        animalList.add("Donkey");
        animalList.add("Cat");
        animalList.add("Dog");
        animalList.add("Duck");

        Collections.sort(animalList);

        for(String animal : animalList){
            System.out.println(animal);
        }
    }
}

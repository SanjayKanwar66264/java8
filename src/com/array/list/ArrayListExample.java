package com.array.list;

import java.util.ArrayList;

/**
 * Created by sanjay kanwar on 2/02/2017.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        System.out.println(numbers);
        for(int i =0; i < numbers.size(); i++){
            System.out.println("Number is " + numbers.get(i));
        }
    }
}

package com.lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by sanjay kanwar on 9/01/2017.
 */
public class BiFunctionMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        Function<Integer, Integer> biFunction = value -> value*2;
        List<Integer> doubledList = list.stream()
                                       .map(biFunction)
                                        .collect(Collectors.toList());

        System.out.println(doubledList);
    }
}

package com.lamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by sanjay kanwar on 11/01/2017.
 */
public class StreamExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("test");
        names.add("Pop");

        names.stream()
                .filter(i -> {
                   return  (i == "Pop");
                })
                .forEach(i -> System.out.println("Value is " + i));


        IntStream intStream = IntStream.range(1,6);
        intStream.forEach(i -> System.out.println("Value is " + i));

        Stream<Long> tenNaturalNumbers = Stream.iterate(1L, n -> n + 1).limit(10);
        tenNaturalNumbers
                .forEach(i -> System.out.println("Value is " + i));


        String str = "Java, Node, .Net";
        Pattern.compile(",")
                .splitAsStream(str)
                .forEach(i-> System.out.println(i));
    }
}

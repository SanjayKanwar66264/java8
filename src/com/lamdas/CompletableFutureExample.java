package com.lamdas;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by sanjay kanwar on 18/01/2017.
 */
public class CompletableFutureExample {
    public static void main(String[] args) {

        List<String>  list = Arrays.asList("Java", "XML", "Javascript", "Java", "Javascript", "Javascript", "Javascript",
                                                "Java","Java","Java","Java","Java","Java","XML","XML");
        Set<String> result = list.stream()
                                .collect(Collectors.toSet());

        System.out.println(result);
    }
}

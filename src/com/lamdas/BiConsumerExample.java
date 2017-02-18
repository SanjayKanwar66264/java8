package com.lamdas;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by sanjay kanwar on 9/01/2017.
 */
public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        biConsumer.accept("java2s.com", " tutorials");


        Consumer<Integer> consumer = (x) -> {
            System.out.println(x);
        };

        consumer.accept(3);
    }
}

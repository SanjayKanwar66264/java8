package com.lamdas;

import org.omg.CORBA.INTERNAL;

import java.util.function.Function;

/**
 * Created by sanjay kanwar on 7/01/2017.
 */
public class LambdaApply {
    public static void main(String[] args) {
        Function<Integer, String> function = x -> Integer.toString(x);
        System.out.println(function.apply(10));
    }
}

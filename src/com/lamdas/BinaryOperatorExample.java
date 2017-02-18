package com.lamdas;

import java.util.function.BinaryOperator;

/**
 * Created by sanjay kanwar on 9/01/2017.
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> integerBinaryOperator = (n1,n2) -> n1 + n2;
        System.out.println(integerBinaryOperator.apply(3,4));
    }
}

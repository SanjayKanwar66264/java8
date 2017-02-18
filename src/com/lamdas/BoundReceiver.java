package com.lamdas;


import javax.rmi.CORBA.Util;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by sanjay kanwar on 7/01/2017.
 */
public class BoundReceiver {
    public static void main(String[] args) {
        Supplier<Integer> stringSupplier = () -> "Test".length();
        System.out.println(stringSupplier.get());

    }
}

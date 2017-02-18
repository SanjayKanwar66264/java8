package com.lamdas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by sanjay kanwar on 9/01/2017.
 */
public class ForEachExample {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) myList.add(i);


        Iterator<Integer> iterator = myList.iterator();
        MyConsumer myConsumer = new MyConsumer();
        myList.forEach(myConsumer);
    }
}
class MyConsumer implements Consumer<Integer>{

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::"+t);
    }


}
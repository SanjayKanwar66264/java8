package com.array.list;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sanjay kanwar on 2/02/2017.
 */
public class HasMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        hashMap.put(5, "Five");
        hashMap.put(15, "Fifteen");
        hashMap.put(30, "Thirty");

        for(Map.Entry<Integer, String> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue() );
        }

    }
}

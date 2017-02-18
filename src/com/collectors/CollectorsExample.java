package com.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        filterNames().forEach(s -> System.out.println("S "+ s));
    }

    public  static  Predicate<String> isJava(){
        return  (String x) -> (x == "java");
    }

    public  static  Predicate<String> isXML(){
        return  (String x) -> (x == "xml");
    }

    public static List<String> filterNames(){
        List<String> names = new ArrayList<>();
        names.add("test");
        names.add("java");
        names.add("xml");
        names.add("java");
        System.out.println(names.stream().filter(isJava().or(isXML())).collect(Collectors.toList()));
        return names.stream().filter(isJava().or(isXML())).collect(Collectors.<String>toList());
    }
}

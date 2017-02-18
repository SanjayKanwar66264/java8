package com.lamdas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by sanjay kanwar on 14/01/2017.
 */
public class ConsumerExample {

    public static void main(String[] args) {
//        List<Student> studentList = new ArrayList();
//        studentList.add(new Student(name: "test", age: 23);
        List<Student> list = new ArrayList();
        list.add(new Student("Java",20));
        list.add(new Student("Perl",22));
        list.add(new Student("C", 23));
        Student oneStudent = new Student("XML", 23  );
        Consumer<Student> studentConsumer = (x) -> {

            System.out.println("Student name is " + x.getName());
        };
        studentConsumer.accept(oneStudent);
        list.forEach(studentConsumer);

    }



}

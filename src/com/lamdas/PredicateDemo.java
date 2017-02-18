package com.lamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by sanjay kanwar on 14/01/2017.
 */
public class PredicateDemo {
    public static void main(String[] args) {
        filterNames();
    }




    public static List<Student> filterNames(){

        Predicate<Student> isAdult =  (Student x) -> (x.getAge() > 20);

        Student student1 = new Student("XML", 12);
        Student student2 = new Student("C", 25);
        Student student3 = new Student("Perl", 34);
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.stream().filter(isAdult).forEach(i -> System.out.println(i.getName()));
        return studentList.stream().filter(isAdult).collect(Collectors.<Student>toList());
    }
}

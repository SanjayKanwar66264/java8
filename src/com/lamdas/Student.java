package com.lamdas;

/**
 * Created by sanjay kanwar on 14/01/2017.
 */
public class Student {

    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age){
        this.name = name;

        this.age = age;
    }
    public void printData(){
        System.out.println("Name:"+name + " age:"+age);
    }
}

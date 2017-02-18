package com.sanjaykanwar;

import com.sun.tools.corba.se.idl.StringGen;

/**
 * Created by sanjay kanwar on 4/01/2017.
 */
public class StudentSort implements Comparable<StudentSort> {

    String name;
    double grade;

    public StudentSort(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


    @Override
    public int compareTo(StudentSort s) {
        if(s == null){
            return -1;
        }
        // System.out.println("Student "+ Double.valueOf(grade).compareTo(s.grade));
        int c = Double.valueOf(grade).compareTo(s.grade);
         c = 0;
        if(c != 0){
            return c;
        }
        System.out.println("Student "+ name.compareTo(s.name));
        return name.compareTo(s.name);
    }
    @Override
    public String toString(){
       return String.format("%s has grade %2f", name, grade);
    }

}


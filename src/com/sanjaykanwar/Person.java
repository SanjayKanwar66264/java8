package com.sanjaykanwar;

/**
 * Created by sanjay kanwar on 3/01/2017.
 */
 class Person implements Comparable<Person>{
    private int id;
    private String name;

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Person)) {
            return false;
        }

        // id must be the same for two Persons to be equal
        Person p = (Person) o;
        if (this.id == p.getId()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
        return "(" + id + ", " + name + ")";
    }

}

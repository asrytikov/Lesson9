package p6;

import java.util.Objects;

public class Person /*implements Comparable<Person>*/{

    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
/*
    @Override
    public int compareTo(Person o) {
        return /*name.compareTo(o.getName()); name.length()-o.getName().length();
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

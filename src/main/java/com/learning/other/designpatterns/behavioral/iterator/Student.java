package com.learning.other.designpatterns.behavioral.iterator;

public class Student {
    private String name;
    private int standard;

    public Student(String name, int standard) {
        this.name = name;
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public int getStandard() {
        return standard;
    }
}

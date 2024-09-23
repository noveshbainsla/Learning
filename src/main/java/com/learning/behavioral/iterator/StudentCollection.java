package com.learning.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentCollection {
    public StudentCollection(List<Student> students) {
        this.students = students;
    }

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

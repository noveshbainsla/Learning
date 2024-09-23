package com.learning.behavioral.iterator;

public class StandardSpecificIterator implements Iterator{
    private StudentCollection studentCollection;
    private int standard;
    private int position;

    public StandardSpecificIterator(StudentCollection studentCollection, int standard) {
        this.studentCollection = studentCollection;
        this.position = 0;
        this.standard = standard;
    }

    public boolean hasNext() {
        return position < studentCollection.getStudents().stream().filter(student -> student.getStandard() == standard).count();
    }

    public Student next() {
        return studentCollection.getStudents().stream().filter(student -> student.getStandard() == standard).skip(position++).findFirst().get();
    }
}

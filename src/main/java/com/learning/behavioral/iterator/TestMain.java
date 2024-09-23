package com.learning.behavioral.iterator;

import java.util.List;

/*
   Iterator pattern is used to provide a standard way to traverse through a group of Objects.
   It becomes important for more complex data structures like trees, graphs, etc. And for data structures
   where we want to iterate by a complex logic. ( like filtering, sorting, etc. )

   Main components of Iterator pattern are:
    1. Iterator: Interface to define the methods to be implemented by concrete iterator classes.
    2. ConcreteIterator: Implements the Iterator interface and keeps track of the current position in the traversal of the aggregate.
 */
public class TestMain {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student("John", 5), new Student("Doe", 6), new Student("Jane", 7));

        // Using custom Iterator
        StudentCollection studentCollection = new StudentCollection(students);
        Iterator studentCustomIterator = new StandardSpecificIterator(studentCollection, 6);
        while (studentCustomIterator.hasNext()) {
            Student student = (Student) studentCustomIterator.next();
            System.out.println("Student: " + student.getName() + ", Standard: " + student.getStandard());
        }
    }
}

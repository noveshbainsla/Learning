package com.learning.structural.adapter;

public class TestMain {
//    Adapter design pattern encompasses the original functionality/object and provides additional transformation on
//    top of base function/object.

//    This design pattern can be used when there are multiple classes and you want a
//    common functionality in all of these without modifying the base objects.

//    In following example it was not possible
//    to get radius functionality without modifying original shape classes ( open/closed principle should be honoured ).
//    But what if we had a parent class Shape.java for all shapes, and in that class we add getRadius method ?
//    This is not possible because we cannot write a common method getRadius for all shapes because some shape has width, some
//    has length and width etc. etc. so it would require us to add if else based on type of Child shape class
//    inside Shape.java getRadius() function which is clumsy.
    public static void main(String[] args) {
        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(4, 3);
        Circle circle = new Circle(3);

        System.out.println(new RadiusAdapterForSquare(square).getRadius());
        System.out.println(new RadiusAdapterForRectangle(rectangle).getRadius());
        System.out.println(circle.getRadius());
    }
}

package com.learning.creational.prototype;

/* Prototype pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing.
 So this pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. This pattern uses java cloning to copy the object.
 also Because it is always not possible to copy an object from outside the class because there might be some private fields and it is possible that we are accessing the object from
 an interface and we do not know the exact implementation class. So we use the clone() method to get the exact copy of the object.

 * there should be a clone() method in the class which needs to be implemented.
 */
public class TestMain {
    public static void main(String[] args) {
        Square prototypeSquare = new Square();
        prototypeSquare.setX(10);
        prototypeSquare.setY(20);
        prototypeSquare.setLength(30);
        prototypeSquare.setWidth(40);

        Circle prototypeCircle = new Circle();
        prototypeCircle.setX(50);
        prototypeCircle.setY(60);
        prototypeCircle.setRadius(70);

        Shape clonedSquare = prototypeSquare.clone();
        Shape clonedCircle = prototypeCircle.clone();
    }
}

package com.learning.structural.adapter;

public class RadiusAdapterForRectangle implements IRadiusFunctionality{
    Rectangle rectangle;
    RadiusAdapterForRectangle(Rectangle rectangle){
        this.rectangle = rectangle;
    }
    @Override
    public double getRadius() {
        return Math.sqrt(rectangle.getLength()*rectangle.getLength() + rectangle.getWidth()* rectangle.getWidth())/2;
    }
}

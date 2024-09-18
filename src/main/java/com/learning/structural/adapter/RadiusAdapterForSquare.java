package com.learning.structural.adapter;

public class RadiusAdapterForSquare implements IRadiusFunctionality{
    Square square;
    RadiusAdapterForSquare(Square square){
        this.square = square;
    }
    @Override
    public double getRadius() {
        return Math.sqrt(2*square.getWidth()*square.getWidth())/2;
    }
}

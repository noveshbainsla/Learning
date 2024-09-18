package com.learning.creational.prototype;

public abstract class Shape {
    private Integer x;
    private Integer y;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Shape(){}
    public Shape(Shape shape){
        this.x = shape.x;
        this.y = shape.y;
    }

    public abstract Shape clone();

    public void setX(int i) {
    }
}

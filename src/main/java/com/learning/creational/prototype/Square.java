package com.learning.creational.prototype;

public class Square extends Shape{
    private Integer length;
    private Integer width;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Square(){}

    public Square(Square square){
        super(square);
        this.length = square.length;
        this.width = square.width;
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }
}

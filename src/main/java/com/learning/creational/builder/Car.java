package com.learning.creational.builder;

public class Car {
    Integer year;
    String name;
    String brand;

    Car(CarBuilder carBuilder){
        this.year = carBuilder.year;
        this.brand = carBuilder.brand;
        this.name = carBuilder.name;
    }

    public static class CarBuilder{
        Integer year;
        String name;
        String brand;

        CarBuilder setYear(Integer year){
            this.year = year;
            return this;
        }
        CarBuilder setName(String name){
            this.name = name;
            return this;
        }
        CarBuilder setBrand(String brand){
            this.brand = brand;
            return this;
        }
        Car build(){
            return new Car(this);
        }
    }
}

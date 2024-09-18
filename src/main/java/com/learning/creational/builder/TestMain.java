package com.learning.creational.builder;

public class TestMain {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setBrand("Toyota")
                .setName("Hyryder")
                .setYear(2023)
                .build();
        System.out.println(car.brand + car.name + car.year);
    }
}

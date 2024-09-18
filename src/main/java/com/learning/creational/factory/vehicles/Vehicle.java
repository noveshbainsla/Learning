package com.learning.creational.factory.vehicles;

public interface Vehicle {
    void start();
    void stop();
    void refuel();
    void honk();
    void accelerate();
    void brake();
    void turnLeft(int degrees);
    void turnRight(int degrees);
}

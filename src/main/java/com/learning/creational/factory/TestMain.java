package com.learning.creational.factory;

import com.learning.creational.factory.factories.FourWheelerFactory;
import com.learning.creational.factory.factories.TwoWheelerFactory;
import com.learning.creational.factory.factories.VehicleFactory;
import com.learning.creational.factory.vehicles.Vehicle;

/* Factory design pattern is used when we have a super class with multiple sub-classes and based on input,
we need to return one of the sub-class. This pattern takes out the responsibility of instantiation of a class from client
program to the factory class.

There should be a common interface for all the sub-classes so that the factory class can return the sub-classes
without the client knowing about them. for example in the below example Vehicle is the common interface for all the
sub-classes.

VehicleFactory is a factory class that returns a vehicle based on the input. It can return a bike or a car.
Further Instead of keeping the if else logic in single concrete VehicleFactory class we can have separate factory classes
for each type of vehicle. This is done in the example below. So one vehicle factory implementation has sole responsibility
of creating a specific type of vehicle.
 */
public class TestMain {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        VehicleFactory fourWheelerFactory = new FourWheelerFactory();

        Vehicle vehicle = twoWheelerFactory.getVehicle();
        vehicle.start();

        vehicle = fourWheelerFactory.getVehicle();
        vehicle.start();
    }
}

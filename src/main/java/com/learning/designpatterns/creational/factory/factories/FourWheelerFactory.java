package com.learning.designpatterns.creational.factory.factories;

import com.learning.designpatterns.creational.factory.vehicles.FourWheelerVehicle;
import com.learning.designpatterns.creational.factory.vehicles.Vehicle;

public class FourWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle() {
        return new FourWheelerVehicle();
    }
}

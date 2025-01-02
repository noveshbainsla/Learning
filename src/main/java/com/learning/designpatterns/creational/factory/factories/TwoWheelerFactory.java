package com.learning.designpatterns.creational.factory.factories;

import com.learning.designpatterns.creational.factory.vehicles.TwoWheelerVehicle;
import com.learning.designpatterns.creational.factory.vehicles.Vehicle;

public class TwoWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle() {
        return new TwoWheelerVehicle();
    }
}

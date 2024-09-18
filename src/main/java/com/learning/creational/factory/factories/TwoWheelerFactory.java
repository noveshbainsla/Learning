package com.learning.creational.factory.factories;

import com.learning.creational.factory.vehicles.TwoWheelerVehicle;
import com.learning.creational.factory.vehicles.Vehicle;

public class TwoWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle() {
        return new TwoWheelerVehicle();
    }
}

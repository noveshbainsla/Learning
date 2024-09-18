package com.learning.creational.factory.factories;

import com.learning.creational.factory.vehicles.FourWheelerVehicle;
import com.learning.creational.factory.vehicles.Vehicle;

public class FourWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle() {
        return new FourWheelerVehicle();
    }
}

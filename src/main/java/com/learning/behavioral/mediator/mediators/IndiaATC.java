package com.learning.behavioral.mediator.mediators;

import com.learning.behavioral.mediator.ATCRequest;
import com.learning.behavioral.mediator.Flight;

import java.util.List;

public class IndiaATC implements AirTrafficController{
    List<Flight> flights;
    @Override
    public void registerFlight(Flight flight) {
        flight.setAirTrafficController(this);
        flights.add(flight);
        System.out.println("Flight "+flight.getFlightNumber()+" registered with India ATC");
    }

    @Override
    public void notify(Flight flight, ATCRequest request) {
        // all the handling logic goes here
    }

    @Override
    public void deregisterFlight(Flight flight) {
        flight.setAirTrafficController(null);
        flights.remove(flight);
        System.out.println("Flight "+flight.getFlightNumber()+" deregistered with India ATC");
    }
}

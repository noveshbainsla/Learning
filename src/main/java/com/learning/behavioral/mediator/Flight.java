package com.learning.behavioral.mediator;
import com.learning.behavioral.mediator.mediators.AirTrafficController;

public class Flight {
    private AirTrafficController airTrafficController;
    private String flightNumber;

    public AirTrafficController getAirTrafficController() {
        return airTrafficController;
    }

    public void setAirTrafficController(AirTrafficController airTrafficController) {
        this.airTrafficController = airTrafficController;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    private String flightStatus;

    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
        this.flightStatus = "In Air";
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }
}

package com.learning.behavioral.mediator;

import com.learning.behavioral.mediator.mediators.AirTrafficController;
import com.learning.behavioral.mediator.mediators.IndiaATC;
import com.learning.behavioral.mediator.mediators.NepalATC;

/*
    * Mediator pattern is used to reduce communication complexity between multiple objects or classes.
    * instead of classes communicating directly with each other, the mediator class is introduced.

    * Mediator pattern shifts the communication logic from classes to mediator class. so if on changes done by class1 has
    * impacts on other classes then that logic can be moved to mediator class, hence Flights need not be aware of each other

    * Main Components are Mediator, Colleague and ConcreteColleague
    * Mediator is interface which has methods to register, deregister and notify Colleagues
    * Mediator implementations has list of Colleagues and logic to notify them

    * Further colleagues also has reference to mediator. So that they can notify mediator about their state change.
 */
public class TestMain {

    public static void main(String[] args) {
        Flight airIndiaFlight = new Flight("AI-2021");
        Flight indigoFlight = new Flight("IG-2021");

        AirTrafficController indiaATC = new IndiaATC();
        AirTrafficController nepalATC = new NepalATC();

        indiaATC.registerFlight(airIndiaFlight);
        indiaATC.notify(airIndiaFlight, new ATCRequest("Landing", "Landing permission required"));
        indiaATC.deregisterFlight(airIndiaFlight);
        nepalATC.registerFlight(airIndiaFlight);

        nepalATC.registerFlight(indigoFlight);
        nepalATC.notify(indigoFlight, new ATCRequest("Landing", "Landing permission required"));
        nepalATC.deregisterFlight(indigoFlight);
        indiaATC.registerFlight(indigoFlight);
    }

}

package com.learning.designpatterns.behavioral.mediator.mediators;

import com.learning.designpatterns.behavioral.mediator.ATCRequest;
import com.learning.designpatterns.behavioral.mediator.Flight;

public interface AirTrafficController {
    void registerFlight(Flight flight);
    void notify(Flight flight, ATCRequest request);
    void deregisterFlight(Flight flight);
}

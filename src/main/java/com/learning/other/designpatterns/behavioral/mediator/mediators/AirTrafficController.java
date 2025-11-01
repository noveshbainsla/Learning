package com.learning.other.designpatterns.behavioral.mediator.mediators;

import com.learning.other.designpatterns.behavioral.mediator.ATCRequest;
import com.learning.other.designpatterns.behavioral.mediator.Flight;

public interface AirTrafficController {
    void registerFlight(Flight flight);
    void notify(Flight flight, ATCRequest request);
    void deregisterFlight(Flight flight);
}

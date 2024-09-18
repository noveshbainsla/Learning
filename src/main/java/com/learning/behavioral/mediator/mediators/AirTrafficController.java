package com.learning.behavioral.mediator.mediators;

import com.learning.behavioral.mediator.ATCRequest;
import com.learning.behavioral.mediator.Flight;

public interface AirTrafficController {
    void registerFlight(Flight flight);
    void notify(Flight flight, ATCRequest request);
    void deregisterFlight(Flight flight);
}

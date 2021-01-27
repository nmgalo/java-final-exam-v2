package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;

public class Train {

    List<Passenger> passengerList = new ArrayList<>();

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void addPassenger(Passenger passenger) {
        if (passenger.ticket)
            passengerList.add(passenger);
    }

}

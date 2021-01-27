import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Assert;
import org.junit.Test;

public class StationSquareTest {

    Train train = new Train();

    @Test
    public void should_returnTrue_when_PassengerHaveTicket() {
        Passenger passenger = new Passenger("ავთანდილი", true);
        train.addPassenger(passenger);
        Assert.assertEquals(true, train.getPassengerList().get(0).haveTicket());
        Assert.assertEquals(1, train.getPassengerList().size());
    }

    @Test
    public void should_returnTrue_when_PassengerNaveNoTickets() {
        Passenger passenger = new Passenger("ფატმანი", false);
        train.addPassenger(passenger);
        Assert.assertEquals(0, train.getPassengerList().size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void should_throwException_when_PassengerNaveNoTicket() {
        Passenger passenger = new Passenger("ვარდისახარი", false);
        train.addPassenger(passenger);
        Assert.assertEquals(true, train.getPassengerList().get(0).haveTicket());
        Assert.assertEquals(0, train.getPassengerList().size());
    }

}

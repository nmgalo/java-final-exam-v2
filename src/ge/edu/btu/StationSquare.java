package ge.edu.btu;

public class StationSquare {

    public static void main(String[] args) {
        Passenger nick = new Passenger("Nick", true);
        Passenger zaura = new Passenger("zaura", false);
        Passenger zura = new Passenger("zura", true);

        Train train = new Train();

        train.addPassenger(nick);
        train.addPassenger(zaura);
        train.addPassenger(zura);

        for (Passenger passenger : train.getPassengerList()) {
            System.out.println(passenger.getName());
        }

    }

}

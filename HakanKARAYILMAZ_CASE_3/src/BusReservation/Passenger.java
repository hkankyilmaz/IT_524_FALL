package BusReservation;

public class Passenger {
    private String name;
    private Destination destination;

    public Passenger(String name, String destination) {
        this.name = name;
        this.destination = Destination.valueOf(destination);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = Destination.valueOf(destination);
    }
}

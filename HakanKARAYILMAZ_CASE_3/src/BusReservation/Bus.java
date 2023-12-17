package BusReservation;

public class Bus {
    private Destination destination;
    private Passenger[] passengers = new Passenger[7];

    public Bus(String destination) {
        this.destination = Destination.valueOf(destination);

    }

    void insertPassenger(Passenger passenger) {

        for (int i = 0; i < passengers.length; i++) {

            if (passengers[i] == null && passenger.getDestination() == this.destination) {
                passengers[i] = passenger;
                System.out.println(passenger.getName() + " is added to the bus");
                break;
            } else{
                if (passengers[passengers.length-1] != null){
                    System.out.println("Bus is full");
                    break;
                }else if (passenger.getDestination() != this.destination){
                    System.out.println(passenger.getName() + " destination is not same with bus destination");
                    break;
                }
            }

        }

    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = Destination.valueOf(destination);
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }
}

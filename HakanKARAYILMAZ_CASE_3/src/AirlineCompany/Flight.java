package AirlineCompany;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Flight {
    private long id;
    private String destination;
    private String departure;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Pilot[] pilot = new Pilot[2];
    private Plane plane;
    private boolean cancelled;



    public Flight(){

    }

    public Flight(long id, String destination, String departure, LocalDateTime departureTime, LocalDateTime arrivalTime, Pilot[] pilot, Plane plane, boolean cancelled) {
        this.id = id;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.pilot = pilot;
        this.plane = plane;
        this.cancelled = cancelled;
    }

    void reassignPilot(Pilot pilot, int index){
        this.pilot[index] = pilot;
        System.out.println("Pilot is reassigned");
    }

    void cancelFlight(){
        if(!cancelled){
            this.cancelled = true;
            System.out.println("Flight is cancelled");
        }
        else System.out.println("Flight is already cancelled");


    }


    String displayFlightInformation(){
        return "Flight" + "\n" +
                "id=" + id +'\n' +
                "destination=" + destination + '\n' +
                "departure=" + departure + '\n' +
                "departureTime=" + departureTime +'\n' +
                "arrivalTime=" + arrivalTime +'\n' +
                "pilot1=" + pilot[0].getName() +'\n' +
                "pilot2=" + pilot[1].getName() +'\n' +
                "plane=" + plane.getName() +'\n' +
                "cancelled=" + cancelled;

    }





    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Pilot[] getPilot() {
        return pilot;
    }

    public void setPilot(Pilot[] pilot) {
        this.pilot = pilot;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}

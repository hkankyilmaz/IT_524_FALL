package AirlineCompany;

import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {



        Pilot pilot1 = new Pilot("Hakan", 1, LocalDateTime.of(1991,1,14,0,0),  LocalDateTime.of(2012,2,14,0,0), "Captain");
        Pilot pilot2 = new Pilot("Ahmet", 2, LocalDateTime.of(1992,2,15,0,0),  LocalDateTime.of(2011,1,18,0,0), "Captain");
        Pilot pilot3 = new Pilot("Mehmet", 3, LocalDateTime.of(1999,3,16,0,0),  LocalDateTime.of(2018,6,24,0,0), "Rookie");
        Pilot pilot4 = new Pilot("Ali", 4, LocalDateTime.of(1998,4,17,0,0),  LocalDateTime.of(2019,2,11,0,0), "Rookie");

        Plane plane1 = new Plane(1, "Boeing 737", 100, 1000, "Narrow");
        Plane plane2 = new Plane(2, "Boeing 747", 200, 2000, "Narrow");

        Flight flight1 = new Flight(1, "Istanbul", "Ankara", LocalDateTime.of(2023,12,20,0,0), LocalDateTime.of(2021,1,1,1,0), new Pilot[]{pilot1, pilot3}, plane1, false);
        Flight flight2 = new Flight(2, "Istanbul", "Izmir", LocalDateTime.of(2023,12,20,0,0), LocalDateTime.of(2021,1,1,1,0), new Pilot[]{pilot2, pilot4}, plane2, false);


        System.out.println(flight1.displayFlightInformation());
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println(flight2.displayFlightInformation());
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        flight1.reassignPilot(pilot2, 0);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        flight1.cancelFlight();
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println(flight1.displayFlightInformation());
        System.out.println("---");
        System.out.println(flight1.getPilot()[0].displayPilotInformation());
        System.out.println("---");
        System.out.println(flight1.getPlane().displayPlaneInformation());
        System.out.println(flight1.getPilot()[1].displayPilotInformation());


    }
}

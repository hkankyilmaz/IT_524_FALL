package BusReservation;

public class Program {

    public static void main(String[] args) {

        Passenger passenger1 = new Passenger("Hakan1", Destination.ADANA.toString());
        Passenger passenger2 = new Passenger("Mehmet2", Destination.ANKARA.toString());
        Passenger passenger3 = new Passenger("Ali3", Destination.ISTANBUL.toString());
        Passenger passenger4 = new Passenger("Osman4", Destination.ADANA.toString());
        Passenger passenger5 = new Passenger("Veli5", Destination.ANKARA.toString());
        Passenger passenger6 = new Passenger("Demet6", Destination.ISTANBUL.toString());
        Passenger passenger7 = new Passenger("Hakan7", Destination.ADANA.toString());
        Passenger passenger8 = new Passenger("Mehmet8", Destination.ANKARA.toString());
        Passenger passenger9 = new Passenger("Ali9", Destination.ISTANBUL.toString());
        Passenger passenger10 = new Passenger("Osman10", Destination.ADANA.toString());
        Passenger passenger11 = new Passenger("Veli11", Destination.ANKARA.toString());
        Passenger passenger12= new Passenger("Demet12", Destination.ISTANBUL.toString());
        Passenger passenger13= new Passenger("Hakan13", Destination.ADANA.toString());
        Passenger passenger14= new Passenger("Mehmet14", Destination.ANKARA.toString());
        Passenger passenger15 = new Passenger("Ali15", Destination.ISTANBUL.toString());
        Passenger passenger16 = new Passenger("Osman16", Destination.ADANA.toString());
        Passenger passenger17 = new Passenger("Veli17", Destination.ANKARA.toString());
        Passenger passenger19 = new Passenger("Demet18", Destination.ISTANBUL.toString());
        Passenger passenger20 = new Passenger("Ali19", Destination.ISTANBUL.toString());
        Passenger passenger21 = new Passenger("Osman20", Destination.ADANA.toString());
        Passenger passenger22 = new Passenger("Veli21", Destination.ANKARA.toString());
        Passenger passenger23 = new Passenger("Demet22", Destination.ISTANBUL.toString());
        Passenger passenger24 = new Passenger("Osman23", Destination.ADANA.toString());


        Bus bus1 = new Bus(Destination.ADANA.toString());
        Bus bus2 = new Bus(Destination.ISTANBUL.toString());
        Bus bus3 = new Bus(Destination.ANKARA.toString());



        bus1.insertPassenger(passenger1);
        bus1.insertPassenger(passenger2);
        bus1.insertPassenger(passenger3);
        bus1.insertPassenger(passenger4);
        bus1.insertPassenger(passenger5);
        bus1.insertPassenger(passenger6);
        bus1.insertPassenger(passenger7);
        bus1.insertPassenger(passenger8);
        bus1.insertPassenger(passenger9);
        bus1.insertPassenger(passenger10);
        bus1.insertPassenger(passenger11);
        bus1.insertPassenger(passenger12);
        bus1.insertPassenger(passenger13);
        bus1.insertPassenger(passenger14);
        bus1.insertPassenger(passenger15);
        bus1.insertPassenger(passenger16);
        bus1.insertPassenger(passenger17);
        bus1.insertPassenger(passenger19);
        bus1.insertPassenger(passenger20);
        bus1.insertPassenger(passenger21);
        bus1.insertPassenger(passenger22);
        bus1.insertPassenger(passenger23);

        System.out.println("-------------------");

        System.out.println(bus1.getPassengers()[0].getName());
        System.out.println(bus1.getPassengers()[1].getName());
        System.out.println(bus1.getPassengers()[2].getName());
        System.out.println(bus1.getPassengers()[3].getName());
        System.out.println(bus1.getPassengers()[4].getName());
        System.out.println(bus1.getPassengers()[5].getName());
        System.out.println(bus1.getPassengers()[6].getName());




    }
}

package com.xworkz.Object.toString;

public class Flight {
    private String airline;
    private String flightNumber;
    private String destination;

    public Flight(String airline, String flightNumber, String destination) {
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Flight{airline='" + airline + "', flightNumber='" + flightNumber + "', destination='" + destination + "'}";
    }
    @Override
    public int hashCode() {
        return 31;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Flight) {
                System.out.println("Comparing!!!!!!");
                Flight flight1 = this;
                Flight flight2 = (Flight) obj;
                if(flight1.airline.equals(flight2.airline) &&  (flight1.flightNumber.equals(flight2.flightNumber))){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }


}

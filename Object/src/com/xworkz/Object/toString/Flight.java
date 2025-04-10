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
}

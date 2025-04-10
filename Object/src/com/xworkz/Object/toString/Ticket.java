package com.xworkz.Object.toString;

public class Ticket {
    private String event;
    private String seat;
    private double price;

    public Ticket(String event, String seat, double price) {
        this.event = event;
        this.seat = seat;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{event='" + event + "', seat='" + seat + "', price=" + price + "}";
    }
}

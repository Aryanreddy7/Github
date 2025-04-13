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
    @Override
    public int hashCode() {
        return 75;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Ticket) {
                System.out.println("Comparing!!!!!!");
                Ticket ticket = this;
                Ticket ticket1 = (Ticket) obj;
                if (ticket.event.equals(ticket1.event) && ticket.price == ticket1.price && ticket.price == ticket1.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}

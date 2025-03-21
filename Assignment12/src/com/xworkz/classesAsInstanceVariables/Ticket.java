package com.xworkz.classesAsInstanceVariables;

public class Ticket {
    Double cost;
    Ticket(double cost){
        this.cost=cost;
    }
    void type(){
        TicketType ticketType = TicketType.GANDICLASS;
        System.out.println(ticketType);
    }
    void buy(){
        System.out.println("Running buy in Ticket"+cost);
    }
    void sell(){
        System.out.println("Running sell in Ticket"+cost);
    }
}

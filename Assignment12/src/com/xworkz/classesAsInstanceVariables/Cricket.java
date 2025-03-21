package com.xworkz.classesAsInstanceVariables;

public class Cricket {
   Ticket ticket;
    Cricket(Ticket ticket){
        this.ticket=ticket;
    }
    void watch(){
        Ticket ticket1=new Ticket(0.0);
        ticket1.buy();
    }
    void profit(){
        Ticket ticket2=new Ticket(10);
        ticket2.sell();

    }
}

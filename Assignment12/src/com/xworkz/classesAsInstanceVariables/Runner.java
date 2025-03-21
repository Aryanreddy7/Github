package com.xworkz.classesAsInstanceVariables;

public class Runner {
    public static void main(String[] args) {
        Clip clip1 = new Clip("red");
        Clip clip2 = new Clip("violet");
        Clip clip3 = new Clip("purple");
        Clip clip4 = new Clip("yellow");
        Clip clip5 = new Clip("black");
        Clip[] clips={clip1,clip2,clip3,clip4,clip5};

        Pushpa pushpa=new Pushpa();
        pushpa.useClip(clips);
        System.out.println("============================");


        Ticket ticket=new Ticket(10);
        ticket.type();

        Cricket cricket=new Cricket("aa");
        cricket.profit();
        cricket.watch();

    }
}

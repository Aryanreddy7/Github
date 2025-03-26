package com.xworkz.ClassesAsLocalVariables;

public class AlienRunner {
    public static void main(String[] args) {
        Alien alien=new Alien();
        Ufo ufo=new Ufo();
        alien.setSeenBy("Uppi");
        alien.setSeenDate(12);
        alien.setDescribe("They were so big catching animals and Eating them raw ");
        ufo.land(alien);

    }

}

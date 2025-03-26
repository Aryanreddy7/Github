package com.xworkz.ClassesAsLocalVariables;

public class Ufo {

    
    public void land(Alien alien){
        if (alien != null) {
            System.out.println("Name: "+alien.getSeenBy());
            System.out.println("Date: "+alien.getSeenDate());
            System.out.println("Describe: "+alien.getDescribe());
        }

    }


    public void land(Alien[] alien){
        if (alien != null) {



        }

    }

}

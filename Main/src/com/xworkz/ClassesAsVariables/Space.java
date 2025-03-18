package com.xworkz.ClassesAsVariables;

public class Space {
    void fly(Rocket rocket){
        if(rocket!=null){
            rocket.takeoff();
            System.out.println("Running fly in Space");
        }
        else{
            System.out.println("Not Running");
        }
    }
}

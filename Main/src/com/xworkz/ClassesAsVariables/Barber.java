package com.xworkz.ClassesAsVariables;

public class Barber {
    void hairCut(Hair hair){
        if(hair!=null){
            hair.comb();
            System.out.println("Running Haircut in Barber ");

        }
        else{
            System.out.println("Not running");
        }
    }
}

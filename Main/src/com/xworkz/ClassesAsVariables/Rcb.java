package com.xworkz.ClassesAsVariables;

public class Rcb {
    void Winner(IplCup iplCup){
        if(iplCup!=null){
            iplCup.win();
            System.out.println("Running Winner in Rcb");
        }
        else{
            System.out.println("Not running");
        }
    }
}

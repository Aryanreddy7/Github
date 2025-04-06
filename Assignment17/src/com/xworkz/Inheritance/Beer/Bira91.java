package com.xworkz.Inheritance.Beer;

public class Bira91 extends Beer {
    public Bira91(){
        System.out.println("Running Bira 91");
    }
    @Override
    public void drink(){
        System.out.println("Drinking Bira91");
    }
    public void serve(){
        System.out.println("Serving Bira91");
    }
    public void pouring(){
        System.out.println("Pouring Bira91");
    }
    public void refilling(){
        System.out.println("Refilling Bira91");
    }
    public void spill(){
        System.out.println("Spilling Bira91");
    }
}

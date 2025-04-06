package com.xworkz.Inheritance.Beer;

public class Miller extends Beer{
    public Miller(){
        System.out.println("Running Miller");
    }
    @Override
    public void drink(){
        System.out.println("Drinking Miller");
    }
    public void serve(){
        System.out.println("Serving Miller");
    }
    public void pouring(){
        System.out.println("Pouring Miller");
    }
    public void refilling(){
        System.out.println("Refilling Miller");
    }
    public void spill(){
        System.out.println("Spilling Miller");
    }
}

package com.xworkz.Inheritance.Beer;

public class Tuborg extends Beer{
    public Tuborg(){
        System.out.println("Running Tuborg");
    }
    @Override
    public void drink(){
        System.out.println("Drinking Tuborg");
    }
    public void serve(){
        System.out.println("Serving Tuborg");
    }
    public void pouring(){
        System.out.println("Pouring Tuborg");
    }
    public void refilling(){
        System.out.println("Refilling Tuborg");
    }
    public void spill(){
        System.out.println("Spilling Tuborg");
    }
}

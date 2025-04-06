package com.xworkz.Inheritance.Beer;

public class Heineken extends Beer{
    public Heineken(){
        System.out.println("Running Heineken");
    }
    @Override
    public void drink(){
        System.out.println("Drinking Heineken");
    }
    public void serve(){
        System.out.println("Serving Heineken");
    }
    public void pouring(){
        System.out.println("Pouring Heineken");
    }
    public void refilling(){
        System.out.println("Refilling Heineken");
    }
    public void spill(){
        System.out.println("Spilling Heineken");
    }
}

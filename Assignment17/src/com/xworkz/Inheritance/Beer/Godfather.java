package com.xworkz.Inheritance.Beer;

public class Godfather extends Beer{
    public Godfather(){
        System.out.println("Running Godfather");
    }
    @Override
    public void drink(){
        System.out.println("Drinking Godfather");
    }
    public void serve(){
        System.out.println("Serving Godfather");
    }
    public void pouring(){
        System.out.println("Pouring Godfather");
    }
    public void refilling(){
        System.out.println("Refilling Godfather");
    }
    public void spill(){
        System.out.println("Spilling Godfather");
    }
}

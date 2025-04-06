package com.xworkz.Inheritance.Beer;

public class Kalyani extends Beer{
    public Kalyani(){
        System.out.println("Running Kalyani");
    }
    @Override
    public void drink(){
        System.out.println("Drinking Kalyani");
    }
    public void serve(){
        System.out.println("Serving Kalyani");
    }
    public void pouring(){
        System.out.println("Pouring Kalyani");
    }
    public void refilling(){
        System.out.println("Refilling Kalyani");
    }
    public void spill(){
        System.out.println("Spilling Kalyani");
    }
}

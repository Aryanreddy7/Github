package com.xworkz.Inheritance.Beer;

public class Simba extends Beer{
    public Simba(){
        System.out.println("Running Simba");
    }
    @Override
    public void drink(){
        System.out.println("Drinking Simba");
    }
    public void serve(){
        System.out.println("Serving Simba");
    }
    public void pouring(){
        System.out.println("Pouring Simba");
    }
    public void refilling(){
        System.out.println("Refilling Simba");
    }
    public void spill(){
        System.out.println("Spilling Simba");
    }
}

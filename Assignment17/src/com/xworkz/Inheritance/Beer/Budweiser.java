package com.xworkz.Inheritance.Beer;

public class Budweiser extends Beer{
    public Budweiser(){
        System.out.println("Running Budweiser");
    }

    @Override
    public void drink(){
        System.out.println("Drinking Budweiser");
    }
    public void serve(){
        System.out.println("Serving Budweiser");
    }
    public void pouring(){
        System.out.println("Pouring Budweiser");
    }
    public void refilling(){
        System.out.println("Refilling Budweiser");
    }
    public void spill(){
        System.out.println("Spilling Budweiser");
    }
}

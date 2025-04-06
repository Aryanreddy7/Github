package com.xworkz.Inheritance.Beer;

public class hoegaarden extends Beer{
    public hoegaarden(){
        System.out.println("Running hoegaarden");
    }
    @Override
    public void drink(){
        System.out.println("Drinking hoegaarden");
    }
    public void serve(){
        System.out.println("Serving hoegaarden");
    }
    public void pouring(){
        System.out.println("Pouring hoegaarden");
    }
    public void refilling(){
        System.out.println("Refilling hoegaarden");
    }
    public void spill(){
        System.out.println("Spilling hoegaarden");
    }
}

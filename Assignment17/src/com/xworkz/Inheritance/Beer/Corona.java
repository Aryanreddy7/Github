package com.xworkz.Inheritance.Beer;

public class Corona extends Beer{
    public Corona(){
        System.out.println("Running Corona");
    }
    @Override
    public void drink(){
        System.out.println("Drinking BadMonkey");
    }
    public void serve(){
        System.out.println("Serving BadMonkey");
    }
    public void pouring(){
        System.out.println("Pouring BadMonkey");
    }
    public void refilling(){
        System.out.println("Refilling BadMonkey");
    }
    public void spill(){
        System.out.println("Spilling BadMonkey");
    }
}

package com.xworkz.Inheritance.Beer;

public class Kings extends Beer{
    public Kings(){
        System.out.println("Running Kings");
    }
    @Override
    public void drink(){
        System.out.println("Drinking Kings");
    }
    public void serve(){
        System.out.println("Serving Kings");
    }
    public void pouring(){
        System.out.println("Pouring Kings");
    }
    public void refilling(){
        System.out.println("Refilling Kings");
    }
    public void spill(){
        System.out.println("Spilling Kings");
    }
}

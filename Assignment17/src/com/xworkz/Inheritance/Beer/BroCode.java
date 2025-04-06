package com.xworkz.Inheritance.Beer;

public class BroCode extends Beer{
    public BroCode(){
        System.out.println("Running BroCode");
    }
    @Override
    public void drink(){
        System.out.println("Drinking BroCode");
    }
    public void serve(){
        System.out.println("Serving BroCode");
    }
    public void pouring(){
        System.out.println("Pouring BroCode");
    }
    public void refilling(){
        System.out.println("Refilling BroCode");
    }
    public void spill(){
        System.out.println("Spilling BroCode");
    }
}

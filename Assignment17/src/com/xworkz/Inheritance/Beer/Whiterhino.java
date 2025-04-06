package com.xworkz.Inheritance.Beer;

public class Whiterhino extends Beer{
    public Whiterhino(){
        System.out.println("Running white rhino");
    }
    @Override
    public void drink(){
        System.out.println("Drinking Whiterhino");
    }
    public void serve(){
        System.out.println("Serving Whiterhino");
    }
    public void pouring(){
        System.out.println("Pouring Whiterhino");
    }
    public void refilling(){
        System.out.println("Refilling Whiterhino");
    }
    public void spill(){
        System.out.println("Spilling Whiterhino");
    }
}

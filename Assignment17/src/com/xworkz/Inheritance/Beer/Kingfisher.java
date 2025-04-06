package com.xworkz.Inheritance.Beer;

public class Kingfisher extends Beer{
    public Kingfisher(){
        System.out.println("Running Kingfisher");
    }
    @Override
    public void drink(){
        System.out.println("Drinking Kingfisher");
    }
    public void serve(){
        System.out.println("Serving Kingfisher");
    }
    public void pouring(){
        System.out.println("Pouring Kingfisher");
    }
    public void refilling(){
        System.out.println("Refilling Kingfisher");
    }
    public void spill(){
        System.out.println("Spilling Kingfisher");
    }
}

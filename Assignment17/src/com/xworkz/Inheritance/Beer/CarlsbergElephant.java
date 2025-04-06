package com.xworkz.Inheritance.Beer;

public class CarlsbergElephant extends Beer{
    public CarlsbergElephant(){
        System.out.println("Running Carlsberg Elephant");
    }
    @Override
    public void drink(){
        System.out.println("Drinking CarlsbergElephant");
    }
    public void serve(){
        System.out.println("Serving CarlsbergElephant");
    }
    public void pouring(){
        System.out.println("Pouring CarlsbergElephant");
    }
    public void refilling(){
        System.out.println("Refilling CarlsbergElephant");
    }
    public void spill(){
        System.out.println("Spilling CarlsbergElephant");
    }
}

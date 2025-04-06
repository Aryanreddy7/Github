package com.xworkz.Inheritance.MobileBrand;

public class Micromax extends MobileBrand{
    public Micromax(){
        System.out.println("Running Micromax");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Micromax");
    }
    public void off(){
        System.out.println("mobile off in Micromax");
    }
    public void charge(){
        System.out.println("charging Mobile in Micromax");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Micromax");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Micromax");
    }
}

package com.xworkz.Inheritance.MobileBrand;

public class Realme extends MobileBrand{
    public Realme(){
        System.out.println("Running Realme");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Realme");
    }
    public void off(){
        System.out.println("mobile off in Realme");
    }
    public void charge(){
        System.out.println("charging Mobile in Realme");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Realme");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Realme");
    }
}

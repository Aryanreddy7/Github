package com.xworkz.Inheritance.MobileBrand;

public class Motorola extends MobileBrand{
    public Motorola(){
        System.out.println("Running Motorola");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Motorola");
    }
    public void off(){
        System.out.println("mobile off in Motorola");
    }
    public void charge(){
        System.out.println("charging Mobile in Motorola");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Motorola");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Motorola");
    }
}

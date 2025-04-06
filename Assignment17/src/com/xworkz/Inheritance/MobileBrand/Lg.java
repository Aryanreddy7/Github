package com.xworkz.Inheritance.MobileBrand;

public class Lg extends MobileBrand{
    public Lg(){
        System.out.println("Running Lg");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Lg");
    }
    public void off(){
        System.out.println("mobile off in Lg");
    }
    public void charge(){
        System.out.println("charging Mobile in Lg");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Lg");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Lg");
    }
}

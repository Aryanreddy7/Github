package com.xworkz.Inheritance.MobileBrand;

public class Oppo extends MobileBrand{
    public Oppo(){
        System.out.println("Running OPPO");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Oppo");
    }
    public void off(){
        System.out.println("mobile off in Oppo");
    }
    public void charge(){
        System.out.println("charging Mobile in Oppo");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Oppo");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Oppo");
    }
}

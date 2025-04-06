package com.xworkz.Inheritance.MobileBrand;

public class Xiaomi extends MobileBrand{
    public Xiaomi(){
        System.out.println("Running Xiaomi");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Xiaomi");
    }
    public void off(){
        System.out.println("mobile off in Xiaomi");
    }
    public void charge(){
        System.out.println("charging Mobile in Xiaomi");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Xiaomi");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Xiaomi");
    }
}

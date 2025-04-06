package com.xworkz.Inheritance.MobileBrand;

public class Google extends MobileBrand{
    public Google(){
        System.out.println("Running Google");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Google");
    }
    public void off(){
        System.out.println("mobile off in Google");
    }
    public void charge(){
        System.out.println("charging Mobile in Google");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Google");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Google");
    }
}

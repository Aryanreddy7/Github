package com.xworkz.Inheritance.MobileBrand;

public class Asus extends MobileBrand{
    public Asus(){
        System.out.println("Running Asus");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Asus");
    }
    public void off(){
        System.out.println("mobile off in Asus");
    }
    public void charge(){
        System.out.println("charging Mobile in Asus");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Asus");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Asus");
    }
}

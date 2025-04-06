package com.xworkz.Inheritance.MobileBrand;

public class Acer extends MobileBrand{
    public Acer(){
        System.out.println("Running Acer");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Acer");
    }
    public void off(){
        System.out.println("mobile off in Acer");
    }
    public void charge(){
        System.out.println("charging Mobile in Acer");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Acer");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Acer");
    }
}

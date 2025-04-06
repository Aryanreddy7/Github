package com.xworkz.Inheritance.MobileBrand;

public class Tecno extends MobileBrand{
    public Tecno(){
        System.out.println("Running Tecno");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Tecno");
    }
    public void off(){
        System.out.println("mobile off in Tecno");
    }
    public void charge(){
        System.out.println("charging Mobile in Tecno");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Tecno");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Tecno");
    }
}

package com.xworkz.Inheritance.MobileBrand;

public class Htc extends MobileBrand{
    public Htc(){
        System.out.println("Running Htc");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Htc");
    }
    public void off(){
        System.out.println("mobile off in Htc");
    }
    public void charge(){
        System.out.println("charging Mobile in Htc");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Htc");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Htc");
    }
}

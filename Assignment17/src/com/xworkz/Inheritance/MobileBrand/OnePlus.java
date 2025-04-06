package com.xworkz.Inheritance.MobileBrand;

public class OnePlus extends MobileBrand{
    public OnePlus(){
        System.out.println("Running OnePlus");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in OnePlus");
    }
    public void off(){
        System.out.println("mobile off in OnePlus");
    }
    public void charge(){
        System.out.println("charging Mobile in OnePlus");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in OnePlus");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in OnePlus");
    }
}

package com.xworkz.Inheritance.MobileBrand;

public class Nokia extends MobileBrand{
    public Nokia(){
        System.out.println("Running Nokia");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Nokia");
    }
    public void off(){
        System.out.println("mobile off in Nokia");
    }
    public void charge(){
        System.out.println("charging Mobile in Nokia");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Nokia");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Nokia");
    }
}

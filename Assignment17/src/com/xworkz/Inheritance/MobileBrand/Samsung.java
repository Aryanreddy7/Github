package com.xworkz.Inheritance.MobileBrand;

public class Samsung extends MobileBrand{
    public Samsung(){
        System.out.println("Running Samsung");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Samsung");
    }
    public void off(){
        System.out.println("mobile off in Samsung");
    }
    public void charge(){
        System.out.println("charging Mobile in Samsung");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Samsung");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Samsung");
    }

}

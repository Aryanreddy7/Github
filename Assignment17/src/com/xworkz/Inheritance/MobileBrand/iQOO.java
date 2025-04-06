package com.xworkz.Inheritance.MobileBrand;

public class iQOO extends MobileBrand{
    public iQOO(){
        System.out.println("Running iQOO");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in iQOO");
    }
    public void off(){
        System.out.println("mobile off in iQOO");
    }
    public void charge(){
        System.out.println("charging Mobile in iQOO");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in iQOO");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in iQOO");
    }
}

package com.xworkz.Inheritance.MobileBrand;

public class Lava extends MobileBrand{
    public Lava(){
        System.out.println("Running LAVA");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Lava");
    }
    public void off(){
        System.out.println("mobile off in Lava");
    }
    public void charge(){
        System.out.println("charging Mobile in Lava");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Lava");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Lava");
    }
}

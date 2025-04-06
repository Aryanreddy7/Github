package com.xworkz.Inheritance.MobileBrand;

public class Infinix extends MobileBrand{
    public Infinix(){
        System.out.println("Running Infinix");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Infinix");
    }
    public void off(){
        System.out.println("mobile off in Infinix");
    }
    public void charge(){
        System.out.println("charging Mobile in Infinix");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Infinix");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Infinix");
    }
}

package com.xworkz.Inheritance.MobileBrand;

public class Vivo extends MobileBrand{
    public Vivo(){
        System.out.println("Running Vivo");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Vivo");
    }
    public void off(){
        System.out.println("mobile off in Vivo");
    }
    public void charge(){
        System.out.println("charging Mobile in Vivo");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Vivo");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Vivo");
    }
}

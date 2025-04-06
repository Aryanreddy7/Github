package com.xworkz.Inheritance.MobileBrand;

public class Apple extends MobileBrand {
    public Apple(){
        System.out.println("Running Apple");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Apple");
    }
    public void off(){
        System.out.println("mobile off in Apple");
    }
    public void charge(){
        System.out.println("charging Mobile in Apple");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Apple");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Apple");
    }
}

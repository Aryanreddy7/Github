package com.xworkz.Inheritance.MobileBrand;

public class BlackBerry extends MobileBrand{
    public BlackBerry(){
        System.out.println("Running BlackBerry");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in BlackBerry");
    }
    public void off(){
        System.out.println("mobile off in BlackBerry");
    }
    public void charge(){
        System.out.println("charging Mobile in BlackBerry");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in BlackBerry");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in BlackBerry");
    }
}

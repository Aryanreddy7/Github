package com.xworkz.Inheritance.MobileBrand;

public class Poco extends MobileBrand{
    public Poco(){
        System.out.println("Running Poco");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Poco");
    }
    public void off(){
        System.out.println("mobile off in Poco");
    }
    public void charge(){
        System.out.println("charging Mobile in Poco");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Poco");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Poco");
    }
}

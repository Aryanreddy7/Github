package com.xworkz.Inheritance.MobileBrand;

public class Huawei extends MobileBrand{
    public Huawei(){
        System.out.println("Running Huawei");
    }
    @Override
    public void on(){
        System.out.println("Mobile On in Huawei");
    }
    public void off(){
        System.out.println("mobile off in Huawei");
    }
    public void charge(){
        System.out.println("charging Mobile in Huawei");
    }
    public void turnOncamera(){
        System.out.println("Turning on Camera in Huawei");
    }
    public void turnOffcamera(){
        System.out.println("Turning off camera in Huawei");
    }
}

package com.xworkz.Inheritance.DressBrand;

public class HAndM extends DressBrand{
    public HAndM(){
        System.out.println("Running H And M");
    }
    @Override
    public void wear(){
        System.out.println("Wearing Dress in HAndM");
    }
    public void remove(){
        System.out.println("Removing Dress in HAndM");
    }
    public void stitch(){
        System.out.println("Stitching Dress in HAndM");
    }
    public void tear(){
        System.out.println("Tearing Dress in HAndM");
    }
    public void cut(){
        System.out.println("Cutting Dress in HAndM");
    }
}

package com.xworkz.Inheritance.DressBrand;

public class Chanel extends DressBrand{
    public Chanel(){
        System.out.println("Running Chanel");
    }
    @Override
    public void wear(){
        System.out.println("Wearing Dress in Chanel");
    }
    public void remove(){
        System.out.println("Removing Dress in Chanel");
    }
    public void stitch(){
        System.out.println("Stitching Dress in Chanel");
    }
    public void tear(){
        System.out.println("Tearing Dress in Chanel");
    }
    public void cut(){
        System.out.println("Cutting Dress in Chanel");
    }
}

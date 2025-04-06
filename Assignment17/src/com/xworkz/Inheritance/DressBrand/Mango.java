package com.xworkz.Inheritance.DressBrand;

public class Mango extends DressBrand{
    public Mango(){
        System.out.println("Running Mango");
    }
    @Override
    public void wear(){
        System.out.println("Wearing Dress in Mango");
    }
    public void remove(){
        System.out.println("Removing Dress in Mango");
    }
    public void stitch(){
        System.out.println("Stitching Dress in Mango");
    }
    public void tear(){
        System.out.println("Tearing Dress in Mango");
    }
    public void cut(){
        System.out.println("Cutting Dress in Mango");
    }
}

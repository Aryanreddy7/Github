package com.xworkz.Inheritance.DressBrand;

public class Zara extends DressBrand{
    public Zara(){
        System.out.println("Running Zara");
    }
    @Override
    public void wear(){
        System.out.println("Wearing Dress in Zara");
    }
    public void remove(){
        System.out.println("Removing Dress in Zara");
    }
    public void stitch(){
        System.out.println("Stitching Dress in Zara");
    }
    public void tear(){
        System.out.println("Tearing Dress in Zara");
    }
    public void cut(){
        System.out.println("Cutting Dress in Zara");
    }
}

package com.xworkz.Inheritance.DressBrand;

public class DolceAndGabbana extends DressBrand{
    public DolceAndGabbana(){
        System.out.println("Running Dolce & Gabbana");
    }
    @Override
    public void wear(){
        System.out.println("Wearing Dress in DolceAndGabbana");
    }
    public void remove(){
        System.out.println("Removing Dress in DolceAndGabbana");
    }
    public void stitch(){
        System.out.println("Stitching Dress in DolceAndGabbana");
    }
    public void tear(){
        System.out.println("Tearing Dress in DolceAndGabbana");
    }
    public void cut(){
        System.out.println("Cutting Dress in DolceAndGabbana");
    }
}

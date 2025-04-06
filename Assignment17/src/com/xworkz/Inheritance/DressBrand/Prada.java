package com.xworkz.Inheritance.DressBrand;

public class Prada extends DressBrand{
    public Prada(){
        System.out.println("Running Prada");
    }
    @Override
    public void wear(){
        System.out.println("Wearing Dress in Prada");
    }
    public void remove(){
        System.out.println("Removing Dress in Prada");
    }
    public void stitch(){
        System.out.println("Stitching Dress in Prada");
    }
    public void tear(){
        System.out.println("Tearing Dress in Prada");
    }
    public void cut(){
        System.out.println("Cutting Dress in Prada");
    }
}

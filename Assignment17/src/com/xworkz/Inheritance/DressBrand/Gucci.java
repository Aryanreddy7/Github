package com.xworkz.Inheritance.DressBrand;

public class Gucci extends DressBrand{
    public Gucci(){
        System.out.println("Running Gucci");
    }
    @Override
    public void wear(){
        System.out.println("Wearing Dress in Gucci");
    }
    public void remove(){
        System.out.println("Removing Dress in Gucci");
    }
    public void stitch(){
        System.out.println("Stitching Dress in Gucci");
    }
    public void tear(){
        System.out.println("Tearing Dress in Gucci");
    }
    public void cut(){
        System.out.println("Cutting Dress in Gucci");
    }
}

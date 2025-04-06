package com.xworkz.Inheritance.DressBrand;

public class Versace extends DressBrand{
    public Versace(){
        System.out.println("Running Versace");
    }
    @Override
    public void wear(){
        System.out.println("Wearing Dress in Versace");
    }
    public void remove(){
        System.out.println("Removing Dress in Versace");
    }
    public void stitch(){
        System.out.println("Stitching Dress in Versace");
    }
    public void tear(){
        System.out.println("Tearing Dress in Versace");
    }
    public void cut(){
        System.out.println("Cutting Dress in Versace");
    }
}

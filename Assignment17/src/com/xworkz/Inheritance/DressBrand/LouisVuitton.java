package com.xworkz.Inheritance.DressBrand;

public class LouisVuitton extends DressBrand{
    public LouisVuitton(){
        System.out.println("Running Louis Vuitton");
    }
    @Override
    public void wear(){
        System.out.println("Wearing Dress in LouisVuitton");
    }
    public void remove(){
        System.out.println("Removing Dress in LouisVuitton");
    }
    public void stitch(){
        System.out.println("Stitching Dress in LouisVuitton");
    }
    public void tear(){
        System.out.println("Tearing Dress in LouisVuitton");
    }
    public void cut(){
        System.out.println("Cutting Dress in LouisVuitton");
    }

}

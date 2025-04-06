package com.xworkz.Inheritance.DressBrand;

public class Givenchy extends DressBrand{
    public Givenchy(){
        System.out.println("Running Givenchy");
    }
    @Override
    public void wear(){
        System.out.println("Wearing Dress in Givenchy");
    }
    public void remove(){
        System.out.println("Removing Dress in Givenchy");
    }
    public void stitch(){
        System.out.println("Stitching Dress in Givenchy");
    }
    public void tear(){
        System.out.println("Tearing Dress in Givenchy");
    }
    public void cut(){
        System.out.println("Cutting Dress in Givenchy");
    }
}

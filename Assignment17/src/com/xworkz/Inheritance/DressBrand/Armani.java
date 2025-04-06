package com.xworkz.Inheritance.DressBrand;

public class Armani extends DressBrand{
    public Armani(){
        System.out.println("Running Armani");
    }
    @Override
    public void wear(){
        System.out.println("Wearing Dress in Armani");
    }
    public void remove(){
        System.out.println("Removing Dress in Armani");
    }
    public void stitch(){
        System.out.println("Stitching Dress in Armani");
    }
    public void tear(){
        System.out.println("Tearing Dress in Armani");
    }
    public void cut(){
        System.out.println("Cutting Dress in Armani");
    }
}

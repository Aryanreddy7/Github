package com.xworkz.Inheritance.DressBrand;

public class Dior extends DressBrand {
    public Dior(){
        System.out.println("Running Dior");
    }
    @Override
    public void wear(){
        System.out.println("Wearing Dress in Dior");
    }
    public void remove(){
        System.out.println("Removing Dress in Dior");
    }
    public void stitch(){
        System.out.println("Stitching Dress in Dior");
    }
    public void tear(){
        System.out.println("Tearing Dress in Dior");
    }
    public void cut(){
        System.out.println("Cutting Dress in Dior");
    }
}

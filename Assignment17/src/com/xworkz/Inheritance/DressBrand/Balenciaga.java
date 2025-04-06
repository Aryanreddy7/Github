package com.xworkz.Inheritance.DressBrand;

public class Balenciaga extends DressBrand{
    public Balenciaga(){

    }
    @Override
    public void wear(){
        System.out.println("Wearing Dress in Balenciaga");
    }
    public void remove(){
        System.out.println("Removing Dress in Balenciaga");
    }
    public void stitch(){
        System.out.println("Stitching Dress in Balenciaga");
    }
    public void tear(){
        System.out.println("Tearing Dress in Balenciaga");
    }
    public void cut(){
        System.out.println("Cutting Dress in Balenciaga");
    }
}

package com.xworkz.Inheritance.Internal;

public class Kachori extends FastFood{
    public Kachori(){
        System.out.println("Running Kachori");
    }
    @Override
    public void eat(){
        System.out.println("Eating Fastfood in Kachori");
    }
    public void taste(){
        System.out.println("Tasting Fastfood in Kachori");
    }
    public void touch(){
        System.out.println("Touching Fastfood in Kachori");
    }
    public void cook(){
        System.out.println("Cooking Fastfood in Kachori");
    }
    public void feel(){
        System.out.println("Throwing Fastfood in Kachori");
    }
}

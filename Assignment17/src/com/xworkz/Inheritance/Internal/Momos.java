package com.xworkz.Inheritance.Internal;


public class Momos extends FastFood {
    public Momos(){
        System.out.println("Running Momos");
    }
    @Override
    public void eat(){
        System.out.println("Eating Fastfood in Momos");
    }
    public void taste(){
        System.out.println("Tasting Fastfood in Momos");
    }
    public void touch(){
        System.out.println("Touching Fastfood in Momos");
    }
    public void cook(){
        System.out.println("Cooking Fastfood in Momos");
    }
    public void feel(){
        System.out.println("Throwing Fastfood in Momos");
    }
}

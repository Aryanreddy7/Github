package com.xworkz.Inheritance.Internal;

public class GolGappa extends FastFood{
    public GolGappa(){
        System.out.println("Running Golgappa");
    }
    @Override
    public void eat(){
        System.out.println("Eating Fastfood in GolGappa");
    }
    public void taste(){
        System.out.println("Tasting Fastfood in GolGappa");
    }
    public void touch(){
        System.out.println("Touching Fastfood in GolGappa");
    }
    public void cook(){
        System.out.println("Cooking Fastfood in GolGappa");
    }
    public void feel(){
        System.out.println("Throwing Fastfood in GolGappa");
    }
}

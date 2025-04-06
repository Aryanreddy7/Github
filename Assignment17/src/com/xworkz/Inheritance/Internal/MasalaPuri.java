package com.xworkz.Inheritance.Internal;

public class MasalaPuri extends FastFood{
    public MasalaPuri(){
        System.out.println("Running Masalapuri");
    }
    @Override
    public void eat(){
        System.out.println("Eating Fastfood in Masalapuri");
    }
    public void taste(){
        System.out.println("Tasting Fastfood in Masalapuri");
    }
    public void touch(){
        System.out.println("Touching Fastfood in Masalapuri");
    }
    public void cook(){
        System.out.println("Cooking Fastfood in Masalapuri");
    }
    public void feel(){
        System.out.println("Throwing Fastfood in Masalapuri");
    }
}

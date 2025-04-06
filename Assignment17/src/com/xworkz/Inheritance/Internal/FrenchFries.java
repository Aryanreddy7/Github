package com.xworkz.Inheritance.Internal;

public class FrenchFries extends FastFood{
    public FrenchFries(){
        System.out.println("Running FrenchFries");
    }
    @Override
    public void eat(){
        System.out.println("Eating Fastfood in FrenchFries");
    }
    public void taste(){
        System.out.println("Tasting Fastfood in FrenchFries");
    }
    public void touch(){
        System.out.println("Touching Fastfood in FrenchFries");
    }
    public void cook(){
        System.out.println("Cooking Fastfood in FrenchFries");
    }
    public void feel(){
        System.out.println("Throwing Fastfood in FrenchFries");
    }
}

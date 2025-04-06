package com.xworkz.Inheritance.Internal;

public class Popcorn extends FastFood{
    public Popcorn(){
        System.out.println("Running Popcorn");
    }
    @Override
    public void eat(){
        System.out.println("Eating Fastfood in Popcorn");
    }
    public void taste(){
        System.out.println("Tasting Fastfood in Popcorn");
    }
    public void touch(){
        System.out.println("Touching Fastfood in Popcorn");
    }
    public void cook(){
        System.out.println("Cooking Fastfood in Popcorn");
    }
    public void feel(){
        System.out.println("Throwing Fastfood in Popcorn");
    }
}

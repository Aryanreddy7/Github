package com.xworkz.Inheritance.Internal;

public class Burger extends FastFood{
    public Burger(){
        System.out.println("Running Burger");
    }
    @Override
    public void eat(){
        System.out.println("Eating Fastfood in Burger");
    }
    public void taste(){
        System.out.println("Tasting Fastfood in Burger");
    }
    public void touch(){
        System.out.println("Touching Fastfood in Burger");
    }
    public void cook(){
        System.out.println("Cooking Fastfood in Burger");
    }
    public void feel(){
        System.out.println("Throwing Fastfood in Burger");
    }
}

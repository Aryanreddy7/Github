package com.xworkz.Inheritance.Internal;

public class Pizza extends FastFood{
    public Pizza(){
        System.out.println("Running Pizza");
    }
    @Override
    public void eat(){
        System.out.println("Eating Fastfood in Pizza");
    }
    public void taste(){
        System.out.println("Tasting Fastfood in Pizza");
    }
    public void touch(){
        System.out.println("Touching Fastfood in Pizza");
    }
    public void cook(){
        System.out.println("Cooking Fastfood in Pizza");
    }
    public void feel(){
        System.out.println("Throwing Fastfood in Pizza");
    }
}

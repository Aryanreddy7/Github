package com.xworkz.Inheritance.Internal;

public class Noodles extends FastFood{
    public Noodles(){
        System.out.println("Running Noodels");
    }
    @Override
    public void eat(){
        System.out.println("Eating Fastfood in Noodles");
    }
    public void taste(){
        System.out.println("Tasting Fastfood in Noodles");
    }
    public void touch(){
        System.out.println("Touching Fastfood in Noodles");
    }
    public void cook(){
        System.out.println("Cooking Fastfood in Noodles");
    }
    public void feel(){
        System.out.println("Throwing Fastfood in Noodles");
    }
}

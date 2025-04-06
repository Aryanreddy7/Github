package com.xworkz.Inheritance.Internal;

public class Panipuri extends FastFood {
    public Panipuri(){
        System.out.println("Running Panipuri");
    }
    @Override
    public void eat(){
        System.out.println("Eating Fastfood in Panipuri");
    }
    public void taste(){
        System.out.println("Tasting Fastfood in Panipuri");
    }
    public void touch(){
        System.out.println("Touching Fastfood in Panipuri");
    }
    public void cook(){
        System.out.println("Cooking Fastfood in Panipuri");
    }
    public void feel(){
        System.out.println("Throwing Fastfood in Panipuri");
    }
}

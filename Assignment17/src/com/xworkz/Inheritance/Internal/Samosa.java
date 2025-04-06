package com.xworkz.Inheritance.Internal;

public class Samosa extends FastFood{
    public Samosa(){
        System.out.println("Running Samosa");
    }
    @Override
    public void eat(){
        System.out.println("Eating Fastfood in Samosa");
    }
    public void taste(){
        System.out.println("Tasting Fastfood in Samosa");
    }
    public void touch(){
        System.out.println("Touching Fastfood in Samosa");
    }
    public void cook(){
        System.out.println("Cooking Fastfood in Samosa");
    }
    public void feel(){
        System.out.println("Throwing Fastfood in Samosa");
    }
}

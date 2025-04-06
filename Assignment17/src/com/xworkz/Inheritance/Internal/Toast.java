package com.xworkz.Inheritance.Internal;

public class Toast extends FastFood {
    public Toast(){
        System.out.println("Running Toast");
    }
    @Override
    public void eat(){
        System.out.println("Eating Fastfood in Toast");
    }
    public void taste(){
        System.out.println("Tasting Fastfood in Toast");
    }
    public void touch(){
        System.out.println("Touching Fastfood in Toast");
    }
    public void cook(){
        System.out.println("Cooking Fastfood in Toast");
    }
    public void feel(){
        System.out.println("Throwing Fastfood in Toast");
    }
}

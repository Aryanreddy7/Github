package com.xworkz.Inheritance.Internal;

public class Gobi extends FastFood{
    public Gobi(){
        super();

        System.out.println("Running Gobi");

    }
    @Override
    public void eat(){
        System.out.println("Eating Fastfood in Gobi");
    }
    public void taste(){
        System.out.println("Tasting Fastfood in Gobi");
    }
    public void touch(){
        System.out.println("Touching Fastfood in Gobi");
    }
    public void cook(){
        System.out.println("Cooking Fastfood in Gobi");
    }
    public void feel(){
        System.out.println("Throwing Fastfood in Gobi");
    }
}

package com.xworkz.Inheritance.Internal;

public class CrispyChicken extends FastFood{
    public CrispyChicken(){
        System.out.println("Running CrispyChicken");
    }
    @Override
    public void eat(){
        System.out.println("Eating Fastfood in CrispyChicken");
    }
    public void taste(){
        System.out.println("Tasting Fastfood in CrispyChicken");
    }
    public void touch(){
        System.out.println("Touching Fastfood in CrispyChicken");
    }
    public void cook(){
        System.out.println("Cooking Fastfood in CrispyChicken");
    }
    public void feel(){
        System.out.println("Throwing Fastfood in CrispyChicken");
    }
}

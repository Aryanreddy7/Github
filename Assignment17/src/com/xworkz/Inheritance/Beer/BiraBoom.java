package com.xworkz.Inheritance.Beer;

public class BiraBoom extends Beer {
    public BiraBoom(){
        System.out.println("Running Bira Boom");
    }

    @Override
    public void drink(){
        System.out.println("Drinking BiraBoom");
    }
    public void serve(){
        System.out.println("Serving BiraBoom");
    }
    public void pouring(){
        System.out.println("Pouring BiraBoom");
    }
    public void refilling(){
        System.out.println("Refilling BiraBoom");
    }
    public void spill(){
        System.out.println("Spilling BiraBoom");
    }
}

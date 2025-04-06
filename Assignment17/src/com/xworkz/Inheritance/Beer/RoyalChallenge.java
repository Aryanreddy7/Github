package com.xworkz.Inheritance.Beer;

public class RoyalChallenge extends Beer{
    public RoyalChallenge(){
        System.out.println("Running Royal Challenge");
    }
    @Override
    public void drink(){
        System.out.println("Drinking RoyalChallenge");
    }
    public void serve(){
        System.out.println("Serving RoyalChallenge");
    }
    public void pouring(){
        System.out.println("Pouring RoyalChallenge");
    }
    public void refilling(){
        System.out.println("Refilling RoyalChallenge");
    }
    public void spill(){
        System.out.println("Spilling RoyalChallenge");
    }
}

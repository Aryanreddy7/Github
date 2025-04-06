package com.xworkz.Inheritance.Beer;

public class KingfisherUltra extends Beer{
    public KingfisherUltra(){
        System.out.println("Running Kingfisher Ultra");
    }
    @Override
    public void drink(){
        System.out.println("Drinking KingfisherUltra");
    }
    public void serve(){
        System.out.println("Serving KingfisherUltra");
    }
    public void pouring(){
        System.out.println("Pouring KingfisherUltra");
    }
    public void refilling(){
        System.out.println("Refilling KingfisherUltra");
    }
    public void spill(){
        System.out.println("Spilling KingfisherUltra");
    }
}

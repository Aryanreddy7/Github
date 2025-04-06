package com.xworkz.Inheritance.Beer;

public class KingfisherStrong extends Beer{
    public KingfisherStrong(){
        System.out.println("Running Kingfisher Strong");
    }
    @Override
    public void drink(){
        System.out.println("Drinking KingfisherStrong");
    }
    public void serve(){
        System.out.println("Serving KingfisherStrong");
    }
    public void pouring(){
        System.out.println("Pouring KingfisherStrong");
    }
    public void refilling(){
        System.out.println("Refilling KingfisherStrong");
    }
    public void spill(){
        System.out.println("Spilling KingfisherStrong");
    }
}

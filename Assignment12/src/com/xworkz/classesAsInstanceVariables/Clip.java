package com.xworkz.classesAsInstanceVariables;

public class Clip {
    String Color;
    Clip(String Color){
        this.Color=Color;
    }
    void hold(){
        System.out.println("Color:"+this.Color);;
    }
}

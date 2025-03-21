package com.xworkz.classesAsInstanceVariables;

public class Brush {
    Color color;

    Brush(Color color){

    }

    void clean() {
        System.out.println("Running Clean");
    }
    void scrub(){
        System.out.println("Running Scrub");
    }
}

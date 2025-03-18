package com.xworkz.ClassesAsVariables;

public class Theater {
    void show(Poster poster){
    if(poster!= null){
        poster.showinfo();
        System.out.println("Running Poster in Theater");
    }
    else{
        System.out.println("not running");
    }
    }
}

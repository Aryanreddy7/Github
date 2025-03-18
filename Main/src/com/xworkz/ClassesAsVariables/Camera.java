package com.xworkz.ClassesAsVariables;

public class Camera {
    void on(Phone phone){
        if(phone!=null){
            phone.ring();
            System.out.println("Running on in Camera");
        }
        else{
            System.out.println("Not running");
        }
    }
}

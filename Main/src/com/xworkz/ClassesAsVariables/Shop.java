package com.xworkz.ClassesAsVariables;

public class Shop {
    void ads(Display display){
        if(display != null){
            display.run();
            System.out.println("running adss in Shop");
        }else{
            System.out.println("ads is not running");
        }
    }
}

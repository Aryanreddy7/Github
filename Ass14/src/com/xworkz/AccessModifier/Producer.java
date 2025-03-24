package com.xworkz.AccessModifier;

import com.workz.AccessSpecifier.Door;

public class Producer {
    Door door=new Door();
    public  void display(){
        this.door.weight=33;
        System.out.println(this.door.weight);
        door.Knock();

    }
}

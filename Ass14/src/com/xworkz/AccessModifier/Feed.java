package com.xworkz.AccessModifier;

import com.workz.AccessSpecifier.Instagram;

public class Feed {
    Instagram instagram=new Instagram();
    void display(){
        this.instagram.followers=10000;
        System.out.println("followers  "  + instagram.followers);
        instagram.follow();
    }
}

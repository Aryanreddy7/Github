package com.xworkz.StaticVariables;

import com.xworkz.StaticVariblesAndEncapsulation.Bed;

public class Pillow {
    private final static int rollno=10;
    public void sleep(Bed bed){
        System.out.println(bed.getName());
        System.out.println(bed.getSize());
    }
    static {
        System.out.println("Roll no:"+rollno);
        System.out.println("Running static in Pillow");
    }
}

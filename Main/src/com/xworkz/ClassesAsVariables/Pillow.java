package com.xworkz.ClassesAsVariables;

public class Pillow {
    void lean(Bed bed) {
        if (bed != null) {
            bed.Sleep();
            System.out.println("Running lean in pillow");
        } else {
            System.out.println("not Running");
        }
    }
}
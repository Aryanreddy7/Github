package com.xworkz.ClassesAsVariables;

public class Mango {
    void taste(Variety variety) {
        if (variety != null) {
            variety.kashmir();
            System.out.println("Running taste in mango");

        } else {
            System.out.println("not Running");
        }

    }
}

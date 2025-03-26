package com.xworkz.ClassesAsLocalVariables;

public class Lens {
    public void capture(Camera camera) {
        if (camera != null) {
            System.out.println("Brand: " + camera.getBrand());
            System.out.println("Price: " + camera.getPrice());
            System.out.println("Type: " + camera.getType());
            System.out.println("Connecticity: " + camera.getConnectivity());
        }
    }
}
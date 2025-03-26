package com.xworkz.ClassesAsLocalVariables;

public class SpaceStation {
    public void spin(Satellite satellite){
        System.out.println(satellite.getType());
        System.out.println(satellite.getCost());
        System.out.println(satellite.getWeight());
        System.out.println(satellite.getLoadCapacity());
    }
}

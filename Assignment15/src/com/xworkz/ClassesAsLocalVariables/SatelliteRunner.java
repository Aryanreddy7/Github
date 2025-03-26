package com.xworkz.ClassesAsLocalVariables;

public class SatelliteRunner {
    public static void main(String[] args) {
        Satellite satellite=new Satellite();
        SpaceStation spaceStation=new SpaceStation();
        satellite.setType(Type.NAVIGATION);
        satellite.setCost(13);
        satellite.setWeight(20.6);
        satellite.setLoadCapacity(100);;
        spaceStation.spin(satellite);
    }
}

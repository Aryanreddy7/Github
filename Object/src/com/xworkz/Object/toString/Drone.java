package com.xworkz.Object.toString;

public class Drone {
    private String model;
    private double range;
    private int cameraQuality;

    public Drone(String model, double range, int cameraQuality) {
        this.model = model;
        this.range = range;
        this.cameraQuality = cameraQuality;
    }

    @Override
    public String toString() {
        return "Drone{model='" + model + "', range=" + range + ", cameraQuality=" + cameraQuality + "}";
    }
    @Override
    public int hashCode() {
        return 26;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Drone) {
                System.out.println("Comparing!!!!!!");
                Drone drone = this;
                Drone drone1 = (Drone) obj;
                if(drone.model.equals(drone1.model)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }


}

package com.xworkz.Object.toString;

public class Projector {
    private String color;
    private boolean dimmable;
    private String controlType;

    public void SmartLight(String color, boolean dimmable, String controlType) {
        this.color = color;
        this.dimmable = dimmable;
        this.controlType = controlType;
    }

    @Override
    public String toString() {
        return "SmartLight{color='" + color + "', dimmable=" + dimmable + ", controlType='" + controlType + "'}";
    }

    @Override
    public int hashCode() {
        return 96;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Projector) {
                System.out.println("Comparing!!!!!!");
                Projector projector = this;
                Projector projector1 = (Projector) obj;
                if (projector.color.equals(projector1.color) && projector.controlType.equals(projector1.controlType) && projector.dimmable==projector1.dimmable) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}

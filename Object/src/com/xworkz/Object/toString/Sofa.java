package com.xworkz.Object.toString;

public class Sofa {
    private String color;
    private int seats;
    private boolean recliner;

    public Sofa(String color, int seats, boolean recliner) {
        this.color = color;
        this.seats = seats;
        this.recliner = recliner;
    }

    @Override
    public String toString() {
        return "Sofa{color='" + color + "', seats=" + seats + ", recliner=" + recliner + "}";
    }
    @Override
    public int hashCode() {
        return 66;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Sofa) {
                System.out.println("Comparing!!!!!!");
                Sofa sofa = this;
                Sofa sofa1 = (Sofa) obj;
                if (sofa.color.equals(sofa1.color) && sofa.recliner==(sofa1.recliner) && sofa.seats == sofa1.seats) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}

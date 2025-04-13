package com.xworkz.Object.toString;

public class Building {
    private String type;
    private int floors;
    private String location;

    public Building(String type, int floors, String location) {
        this.type = type;
        this.floors = floors;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Building{type='" + type + "', floors=" + floors + ", location='" + location + "'}";
    }
    @Override
    public int hashCode() {
        return 10;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Building) {
                System.out.println("Comparing!!!!!!");
                Building building = this;
                Building building1 = (Building) obj;
                if(building.location.equals(building1.location)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}

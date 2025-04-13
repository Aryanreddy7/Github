package com.xworkz.Object.toString;

public class Hospital {
    private String name;
    private int beds;
    private String location;

    public Hospital(String name, int beds, String location) {
        this.name = name;
        this.beds = beds;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Hospital{name='" + name + "', beds=" + beds + ", location='" + location + "'}";
    }
    @Override
    public int hashCode() {
        return 39;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Hospital) {
                System.out.println("Comparing!!!!!!");
                Hospital hospital = this;
                Hospital hospital1 = (Hospital) obj;
                if (hospital.name.equals(hospital1.name) && hospital.beds == hospital1.beds) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}

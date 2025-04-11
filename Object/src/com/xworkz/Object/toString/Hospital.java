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
}

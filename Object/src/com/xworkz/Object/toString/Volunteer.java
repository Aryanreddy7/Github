package com.xworkz.Object.toString;

public class Volunteer {
    private String name;
    private String organization;
    private int hoursServed;

    public Volunteer(String name, String organization, int hoursServed) {
        this.name = name;
        this.organization = organization;
        this.hoursServed = hoursServed;
    }

    @Override
    public String toString() {
        return "Volunteer{name='" + name + "', organization='" + organization + "', hoursServed=" + hoursServed + "}";
    }
}

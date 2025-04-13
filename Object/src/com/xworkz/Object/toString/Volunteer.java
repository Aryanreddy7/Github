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
    @Override
    public int hashCode() {
        return 82;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Volunteer) {
                System.out.println("Comparing!!!!!!");
                Volunteer volunteer = this;
                Volunteer volunteer1 = (Volunteer) obj;
                if (volunteer.name.equals(volunteer1.name) && volunteer.hoursServed == volunteer1.hoursServed && volunteer.organization.equals(volunteer1.organization)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}

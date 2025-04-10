package com.xworkz.Object.toString;

public class Chef {
    private String name;
    private String specialty;
    private int experience;

    public Chef(String name, String specialty, int experience) {
        this.name = name;
        this.specialty = specialty;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Chef{name='" + name + "', specialty='" + specialty + "', experience=" + experience + "}";
    }
}


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
    @Override
    public int hashCode() {
        return 14;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Chef) {
                System.out.println("Comparing!!!!!!");
                Chef chef = this;
                Chef chef1 = (Chef) obj;
                if(chef.name.equals(chef1.name)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}


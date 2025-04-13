package com.xworkz.Object.toString;

public class Aquarium {
    private String name;
    private int capacity;
    private String waterType;

    public Aquarium(String name, int capacity, String waterType) {
        this.name = name;
        this.capacity = capacity;
        this.waterType = waterType;
    }

    @Override
    public String toString() {
        return "Aquarium{name='" + name + "', capacity=" + capacity + ", waterType='" + waterType + "'}";
    }
    @Override
    public int hashCode() {
        return 04;
    }
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Aquarium) {
                System.out.println("Comparing!!!!!!");
                Aquarium aquarium = this;
                Aquarium aquarium1 = (Aquarium) obj;
                if(aquarium.name.equals(aquarium1.name)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}

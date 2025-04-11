package com.xworkz.Object.toString;

public class Pet {
    private String name;
    private String species;
    private int age;

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{name='" + name + "', species='" + species + "', age=" + age + "}";
    }
    @Override
    public int hashCode() {
        return 56;
    }
}

package com.xworkz.Object.toString;

public class Animal {
    private String species;
    private int age;
    private String habitat;

    public Animal(String species, int age, String habitat) {
        this.species = species;
        this.age = age;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Animal{species='" + species + "', age=" + age + ", habitat='" + habitat + "'}";
    }
    @Override
    public int hashCode() {
        return 03;
    }
}

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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Animal)
            {
                System.out.println("Comparing!!!!!!");
                Animal animal=this;
                Animal animal1=(Animal)obj;
                if(animal.species.equals(animal1.species))
                {
                    System.out.println("both  are same");
                    return true;
                }
            }
        }
        return false;
    }
}
